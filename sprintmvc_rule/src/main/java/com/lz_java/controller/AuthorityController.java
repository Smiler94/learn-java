package com.lz_java.controller;

import com.lz_java.entity.Authority;
import com.lz_java.entity.AuthorityVO;
import com.lz_java.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/authority")
public class AuthorityController {

    @Autowired
    private AuthorityRepository authorityRepository;

    @GetMapping(value="/add")
    public String add() {
        return "authority/add";
    }

    @PostMapping("/add")
    public String add(Authority authority) {
        authorityRepository.save(authority);
        return "redirect:/authority/add";
    }

    @GetMapping("/getAll")
    @ResponseBody
    public AuthorityVO getAll(int page,int limit) {
        Pageable pageable = new PageRequest(page-1, limit);
        PageImpl pageImpl = authorityRepository.findAll(pageable);
        List<Authority> list = pageImpl.getContent();
        AuthorityVO authorityVO = new AuthorityVO();
        authorityVO.setData(list);
        authorityVO.setCount(authorityRepository.count());
        return authorityVO;
    }

    @GetMapping("/index")
    public String list() {
        return "authority/index";
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable(value="id") String id) {
        Authority authority = authorityRepository.findById(id);
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("authority/update");
        modelAndView.addObject(authority);
        return modelAndView;
    }

    @PostMapping("update")
    public String update(Authority authority) {
        authorityRepository.save(authority);
        return "redirect:/authority/index";
    }

    @GetMapping("deleteById/{id}")
    public String delete(String id) {
        authorityRepository.deleteById(id);
        return "redirect:/authority/index";
    }
}
