package org.wiley.layout.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gwiley on 3/9/16.
 *
 * Based on sample from http://stackoverflow.com/questions/28636223/is-it-possible-to-pass-parameters-to-layout-in-thymeleaf-layout-dialect
 */
@Controller
public class LayoutDemoController {

    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

}
