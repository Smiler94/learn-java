package com.lz_java.controller;

import com.lz_java.entity.Role;
import com.lz_java.entity.User;
import com.lz_java.entity.UserVO;
import com.lz_java.repository.AuthorityRepository;
import com.lz_java.repository.RoleRepository;
import com.lz_java.repository.UserRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("add")
    public ModelAndView add(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);

        modelAndView.addObject("list", roleRepository.findAll().iterator());
        modelAndView.setViewName("user/add");
        return modelAndView;
    }

    @PostMapping("add")
    public String add(User user) {
        userRepository.save(user);
        return "redirect:/user/index";
    }

    @GetMapping("index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @GetMapping("getAll")
    @ResponseBody
    public UserVO getAll(int page, int limit) {
        Pageable pageable = new PageRequest(page-1, limit);
        PageImpl pageImpl = userRepository.findAll(pageable);

        List<User> users = pageImpl.getContent();
        UserVO userVO = new UserVO();
        userVO.setData(users);
        userVO.setCount(userRepository.count());
        return userVO;
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable(value = "id") String id,HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);

        User user = userRepository.findById(id);
        List<String> myRoles = user.getRoles();
        Iterator<Role> allRoles = roleRepository.findAll().iterator();
        List<Role> roles = new ArrayList<Role>();

        while(allRoles.hasNext()) {
            Role role = allRoles.next();
            role.setHas(myRoles.contains(role.getId()));
            roles.add(role);
        }
        modelAndView.setViewName("user/update");
        modelAndView.addObject("user", user);
        modelAndView.addObject("roles", roles);
        return modelAndView;
    }
}
