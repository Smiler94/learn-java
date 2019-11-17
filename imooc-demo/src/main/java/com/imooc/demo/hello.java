package com.imooc.demo;

import com.imooc.demo.dao.AreaDao;
import com.imooc.demo.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hello {
    @Autowired
    private AreaDao areaDao;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello() {
        List<Area> areaList = areaDao.queryArea();
        return "";
    }
}
