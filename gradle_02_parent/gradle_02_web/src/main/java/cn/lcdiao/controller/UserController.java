package cn.lcdiao.controller;

import cn.lcdiao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by diao on 2019/3/1
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public String save(Model model){
        String save = userService.save();
        model.addAttribute("save",save);
        return "list";
    }
}
