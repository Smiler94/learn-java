package com.lz_java.view;

import org.springframework.web.servlet.ModelAndView;

public class BaseView extends ModelAndView {
    private String path;

    public BaseView() {
        super();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
