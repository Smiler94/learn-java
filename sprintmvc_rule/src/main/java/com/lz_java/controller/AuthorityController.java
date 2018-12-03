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

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/authority")
public class AuthorityController extends BaseController{

    @Autowired
    private AuthorityRepository authorityRepository;

    @GetMapping(value="/add")
    public ModelAndView add(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);
        modelAndView.setViewName("authority/add");

        return modelAndView;
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
    public ModelAndView list(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);
        modelAndView.setViewName("authority/index");
        return modelAndView;
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable(value="id") String id,HttpServletRequest request) {
        Authority authority = authorityRepository.findById(id);
        ModelAndView modelAndView = getMv(request);

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
