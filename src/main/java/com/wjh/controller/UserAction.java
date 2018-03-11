package com.wjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sillyboy on 2018/3/11
 */
@Controller
@RequestMapping("/myUser")
public class UserAction {


    @RequestMapping(value = "/getName")
    @ResponseBody
    public String getget(@RequestParam(value = "name", required = false) String name) {
        return name;
    }
}
