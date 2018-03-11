package com.sillyboy.customer.open;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sillyboy on 2017/12/10
 */
@RequestMapping("/viewResolver")
@Controller
public class ViewResolver {

    @RequestMapping("/testViewResolver")
    public String testViewResolver(){
        System.out.println("testViewResolver");
        return "/pages/success.jsp";
    }

    @RequestMapping("/testView")
    public String testView(){
        System.out.println("testView");
        return "/pages/success.jsp";
    }
}
