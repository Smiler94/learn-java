package com.lz_java.controller;

import com.lz_java.repository.AuthorityRepository;
import com.lz_java.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AuthorityRepository authorityRepository;
}
