package com.zac.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zac.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <h3>dubboweb</h3>
 * <p>UserController</p>
 *
 * @author : 沈疴
 * @date : 2020-09-19 17:18
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){
        return userService.getName();
    }
}
