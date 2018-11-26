package com.lz_java.controller;

import com.lz_java.dao.CourseDAO;
import com.lz_java.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
    @Autowired
    private CourseDAO courseDAO;

    @GetMapping(value="/add")
    public String addPage() {
        return "course/add";
    }
    @PostMapping(value="/add")
    public String add(Course course) {
        courseDAO.add(course);
        return "redirect:/getAll";
    }

    @GetMapping(value="/getAll")
    public ModelAndView getAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course/index");
        modelAndView.addObject("courses", courseDAO.getAll());
        return modelAndView;
    }

    @GetMapping(value="/getById/{id}")
    public ModelAndView getById(@PathVariable(value="id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("course/edit");
        modelAndView.addObject("course", courseDAO.getById(id));
        return modelAndView;
    }

    @PutMapping(value="/update")
    public String update(Course course) {
        System.out.println(course);
        courseDAO.update(course);
        return "redirect:/getAll";
    }

    @DeleteMapping(value="/delete/{id}")
    public String delete(@PathVariable(value="id") int id) {
        courseDAO.deleteById(id);
        return "redirect:/getAll";
    }
}
