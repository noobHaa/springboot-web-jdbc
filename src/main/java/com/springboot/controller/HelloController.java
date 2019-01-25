package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: springboot-web-jdbc
 * @Package: com.springboot.controller
 * @ClassName: HelloController
 * @Author: gnnt
 * @Date: 2019/1/25 14:26
 * @Version: 1.0
 */
@Controller
public class HelloController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/hello")
    public Map<String, Object> hello() {
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList("select * from department");
        return mapList.get(0);
    }
}
