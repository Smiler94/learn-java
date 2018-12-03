package com.lz_java.controller;

import com.lz_java.entity.Authority;
import com.lz_java.entity.RoleVO;
import com.lz_java.entity.Role;
import com.lz_java.repository.AuthorityRepository;
import com.lz_java.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    @GetMapping("/add")
    public ModelAndView add(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);
        System.out.println(authorityRepository.findAll().iterator());
        modelAndView.addObject("list", authorityRepository.findAll().iterator());
        modelAndView.setViewName("role/add");
        return modelAndView;
    }

    @PostMapping("add")
    public String add(Role role) {
        roleRepository.save(role);
        return "redirect:/role/index";
    }

    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);
        modelAndView.setViewName("role/index");
        return modelAndView;
    }

    @GetMapping("/getAll")
    @ResponseBody
    public RoleVO getAll(int page,int limit) {
        Pageable pageable = new PageRequest(page-1, limit);
        PageImpl pageImpl = roleRepository.findAll(pageable);

        List<Role> role = pageImpl.getContent();
        RoleVO roleVO = new RoleVO();
        roleVO.setData(role);
        roleVO.setCount(roleRepository.count());
        return roleVO;
    }

    @GetMapping("findById/{id}")
    public ModelAndView findById(@PathVariable(value = "id") String id,HttpServletRequest request) {
        ModelAndView modelAndView = getMv(request);

        Role role = roleRepository.findById(id);
        modelAndView.addObject("role", role);
        List<String> myAuths = role.getAuths();
        List<Authority> auths = new ArrayList<Authority>();
        Iterator<Authority> allAuths = authorityRepository.findAll().iterator();
        while(allAuths.hasNext()) {
            Authority auth = allAuths.next();
            auth.setHas(myAuths.contains(auth.getId()));
            auths.add(auth);
        }

        modelAndView.addObject("auths", auths);
        modelAndView.setViewName("role/update");
        return modelAndView;
    }
}
