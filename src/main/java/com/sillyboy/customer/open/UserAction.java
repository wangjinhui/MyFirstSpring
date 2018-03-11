package com.sillyboy.customer.open;

import com.sillyboy.customer.modules.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by sillyboy on 2018/1/14
 */
@Controller("UserAction")
@RequestMapping("/web/user")
public class UserAction {

    @Autowired
    @Qualifier(value = "userService1")
    UserService userService;


    /*//或
    @Resource(name = "userService1")
    private UserService userService;*/

    @RequestMapping("/get")
    @ResponseBody
    public String get(){
        String result=userService.init();
        System.out.println(result);
        return "1";
    }
}
