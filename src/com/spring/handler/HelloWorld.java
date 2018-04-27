package com.spring.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ryan
 * @version $Id: HelloWorld.Java, v 0.1 2018/4/17 17:47 zy28313 Exp $
 */
@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String Hello() {
        System.out.println("Hello world!");
        return "success";
    }
}
