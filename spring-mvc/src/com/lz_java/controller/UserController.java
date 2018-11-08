package com.lz_java.controller;

import com.lz_java.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.Validator;

@Controller
public class UserController {
    @Autowired
    @Qualifier("userValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder)
    {
        binder.setValidator(validator);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user()
    {
        return new ModelAndView("user/user", "command", new User());
    }

    @ModelAttribute("user")
    public User createUserModel()
    {
        return new User();
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") @Validated User user, BindingResult bindingResult, Model model)
    {
        if (bindingResult.hasErrors()) {
            return "user/user";
        }
        model.addAttribute("name", user.getName());
        model.addAttribute("age", user.getAge());
        model.addAttribute("id", user.getId());
        return "user/result";
    }
}
