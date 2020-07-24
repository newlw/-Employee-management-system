package com.lw.springboot_web.controller;

import com.lw.springboot_web.pojo.User;
import com.lw.springboot_web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;
//    @ResponseBody
    @RequestMapping("user/login")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Model model,
                        HttpSession session){
        List<User> users = userService.findUser();
        for (User user : users) {
            if (user.getUsername().equals(username)&&user.getPassword().equals(password)){
//                return "dashboard";
                session.setAttribute("username",username);
//                return "redirect:/success.html";
                return "dashboard";
            }
        }

        model.addAttribute("msg","登录失败，用户名或密码错误");
        return "index";
    }
}
