package com.zycat.csrf;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSRFController {
    @RequestMapping("h")
    @CrossOrigin
    public String h(){
        System.out.println("一个请求进入了啊");
        return "h";

    }
    @RequestMapping("h1")
    public String jsonp(){
        JSONPObject json = new JSONPObject("random",Math.random());
        return json.toString();
    }
}
