package com.zycat.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("h")
    String hello(){
        return "hhh";
    }
}
