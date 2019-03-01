package cn.lcdiao.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by diao on 2019/3/1
 */
@org.springframework.stereotype.Controller
@RequestMapping("/hello")
public class Controller {

    @RequestMapping("/list")
    public String toList(){
        return "list";
    }
}
