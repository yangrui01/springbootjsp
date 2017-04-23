package com.zygxy.controller;/**
 * Created by abc83 on 2017/4/23.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

/**
 * @author yangrui
 * @create 2017-04-23 17:10
 **/
@Controller
public class TestJspController {

    @RequestMapping("/")
    public String toIndex(Map map) {
        map.put("date", new Date());
        map.put("name","yangrui");
        return "index";
    }
}
