package com.lz_java.entity;

import java.util.ArrayList;
import java.util.List;

public class Nav {
    private String name;
    private boolean isCurrent;
    private String uri;
    private List<Nav> subNavs;

    public Nav(String name, String uri) {
        this.name = name;
        this.uri = uri;
        this.isCurrent = false;
        this.subNavs = new ArrayList<Nav>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getIsCurrent() {
        return isCurrent;
    }

    public void setIsCurrent(boolean current) {
        isCurrent = current;
    }

    public List<Nav> getSubNavs() {
        return subNavs;
    }

    public void setSubNavs(List<Nav> subNavs) {
        this.subNavs = subNavs;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void addSubNav(Nav nav) {
        this.subNavs.add(nav);
    }

    @Override
    public String toString() {
        return "Nav{" +
                "name='" + name + '\'' +
                ", isCurrent=" + isCurrent +
                ", uri='" + uri + '\'' +
                ", subNavs=" + subNavs +
                '}';
    }
}
