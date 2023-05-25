package com.niesens.sample.SpringBootJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class HelloWorldController {
    public static String getMessage() {
        return "Hello World";
    }

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        return "helloWorld";
    }

    @RequestMapping("/exception")
    public String exception(Map<String, Object> model) {
        throw new RuntimeException("The exceptional exception");
    }
}
