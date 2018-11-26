package com.lz_java.dao;

import com.lz_java.model.Course;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CourseDAO {
    private Map<Integer, Course> courses = new HashMap<Integer, Course>();

    public void add(Course course) {
        courses.put(course.getId(), course);
    }

    public Collection<Course> getAll() {
        return courses.values();
    }
    public Course getById(int id) {
        return courses.get(id);
    }

    public void update(Course course) {
        courses.put(course.getId(), course);
    }

    public void deleteById(int id) {
        courses.remove(id);
    }
}
