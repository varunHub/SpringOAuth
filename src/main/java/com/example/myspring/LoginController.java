package com.example.myspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@Configuration
@RestController
@RequestMapping("login")
public class LoginController {


    @GetMapping("/user")
    public Object login(){
        return Collections.singletonMap("page","login");
    }

    @GetMapping("/test")
    public Object test(){
        return Collections.singletonMap("page","test");
    }


}
