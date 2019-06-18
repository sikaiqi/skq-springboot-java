package com.skq.springboot.controller;

import com.skq.springboot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/6/16 0016.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","Spring Boot 继承Thymeleaf。");
        User user = new User();
        user.setId(3);
        user.setNick("nick");
        user.setPhone("213234");
        user.setEmail("234@dasg");
        user.setAddress("辣椒粉蓝色111");
        model.addAttribute("user",user);
        return "index";
    }

}
