package com.spring.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Controller {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

}
