package com.sillyboy.customer.open;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sillyboy on 2017/12/10
 */
@Controller
@RequestMapping("/security")
public class LoginAction {

    /**
     * String html
     */
    @RequestMapping("/getget")
    public String getget() {
        return "/pages/index.html";
    }

    /**
     * String
     */
    @RequestMapping("/getget1")
    @ResponseBody
    public String getget1() {
        System.out.println("11");
        return "111";
    }

    /**
     * ModelAndView html
     */
    @RequestMapping("/getget2")
    public ModelAndView getget2() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("/pages/index.jsp");
        return modelAndView;
    }

    /**
     * 重定向
     */
    @RequestMapping("/getget3")
    public String getget3() {
        return "redirect:/myController";
    }

    /**
     * ModelAndView重定向
     */
    @RequestMapping("/getget4")
    public ModelAndView getget4() {
        return new ModelAndView("redirect:/toList");
    }
}
