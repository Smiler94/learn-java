package com.lz_java.controller;

import com.lz_java.entity.Nav;
import com.lz_java.repository.NavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class BaseController {
    @Autowired
    private NavRepository navRepository;

    public ModelAndView getMv(HttpServletRequest request) {
        String path = request.getRequestURI();
        List<Nav> allNavs = navRepository.getNav();
        ModelAndView modelAndView = new ModelAndView();
        for(Nav nav: allNavs) {
            label1:
            for(Nav subNav: nav.getSubNavs()) {
                if (path.equals(subNav.getUri())) {
                    subNav.setIsCurrent(true);
                    nav.setIsCurrent(true);
                    break label1;
                }
            }
        }
        modelAndView.addObject("navs", allNavs);
        return modelAndView;
    }
}
