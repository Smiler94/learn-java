package com.lz_java.repository;

import com.lz_java.entity.Nav;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class NavRepository {
    public List<Nav> getNav() {
        List<Nav> allNav = new ArrayList<Nav>();

        Nav nav = new Nav("权限管理", "");
        nav.addSubNav(new Nav("查询权限", "/authority/index"));
        nav.addSubNav(new Nav("新增权限", "/authority/add"));
        allNav.add(nav);

        nav = new Nav("角色管理", "");
        nav.addSubNav(new Nav("查询角色", "/role/index"));
        nav.addSubNav(new Nav("新增角色", "/role/add"));
        allNav.add(nav);

        nav = new Nav("用户管理", "");
        nav.addSubNav(new Nav("查询用户", "/user/index"));
        nav.addSubNav(new Nav("新增用户", "/user/add"));
        allNav.add(nav);

        return allNav;
    }
}
