package com.spring.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.spring.entities.User;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * @author Ryan
 * @version $Id: springMVCTest.Java, v 0.1 2018/4/17 18:06 zy28313 Exp $
 */
@RequestMapping("/springmvc")
//@SessionAttributes(value = {"user"}, types = {String.class})//只能放在类上
@Controller
public class springMVCTest {

    private static final String SUCCESS = "success";

    @RequestMapping(value = "/testModelAttribute", method = RequestMethod.POST)
    public String testModelAttribute(User user) {
        System.out.println("修改： " + user);
        return SUCCESS;
    }

//    @RequestMapping("/testSessionAttributes")
//    public String testSessionAttributes(Map<String, Object> map) {
//        User user = new User(11, "Tom", "123456", "zy@111", 11);
//        map.put("user", user);
//        map.put("school", "ryan");
//        return SUCCESS;
//    }


    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("names", Arrays.asList("Tom", "Jerry", "mike"));
        return SUCCESS;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);

        modelAndView.addObject("time", new Date());

        return modelAndView;

    }

    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer out) throws IOException {
        System.out.println("testServletAPI, " + request + "," + response);
        out.write("hello springmvc");
//        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user) {
        System.out.println("testPojo:" + user);
        return SUCCESS;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String sessionId) {
        System.out.println("testCookieValue" + sessionId);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al) {
        System.out.println("testRequestHeader,Accept-Language:" + al);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam(value = "username") String un, @RequestParam(value = "age", required = false, defaultValue = "0") int age) {
        System.out.println("username:" + un + " age:" + age);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testPut(@PathVariable Integer id) {
        System.out.println("testRest delete:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testDelete(@PathVariable Integer id) {
        System.out.println("testRest delete:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest", method = RequestMethod.POST)
    public String testRest() {
        System.out.println("testRest POST");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id) {
        System.out.println("testRest GET:" + id);
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable:" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRequestMapping")
    public String testRequestMapping() {
        System.out.println("test Request");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("test Method");
        return SUCCESS;
    }

    @RequestMapping(value = "testParamsAndHeaders", params = {"username", "age!=10"}, headers = "Accept-Language=zh-CN,zh;q=0.8")
    public String testParamsAndHeaders() {
        System.out.println("test params and heads");
        return SUCCESS;
    }
}
