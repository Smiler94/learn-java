package com.lz_java.controller;

import com.lz_java.repository.AuthorityRepository;
import com.lz_java.repository.RoleRepository;
import com.lz_java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRepository userRepository;
}
