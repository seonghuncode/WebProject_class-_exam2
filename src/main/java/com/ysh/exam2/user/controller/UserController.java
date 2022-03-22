package com.ysh.exam2.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @RequestMapping("")
    @ResponseBody
    public String users(){

        return "잘 작동하는지 확인";
    }

    @RequestMapping("1")
    @ResponseBody
    public String user(){
        return "수정하자";
    }

}
