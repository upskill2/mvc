package com.spring.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/")
    public String showFirstView() {
        return "first-view";
    }

}
