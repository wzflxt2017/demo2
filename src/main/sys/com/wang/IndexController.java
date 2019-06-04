package com.wang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wangzefeng on 2019/5/16 0016.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hello","你好！");
        modelAndView.setViewName("index");
        return modelAndView;
//        return "hello";
    }
}
