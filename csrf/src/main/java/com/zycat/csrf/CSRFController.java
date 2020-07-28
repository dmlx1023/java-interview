package com.zycat.csrf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSRFController {
    @RequestMapping("h")
    public String h(){
        System.out.println("一个请求进入了啊");
        return "h";

    }
}
