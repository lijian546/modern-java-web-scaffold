package com.github.lavenderx.controller;

import com.github.lavenderx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2016-01-18.
 *
 * @author lavenderx
 */
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getAllUser() {
        return "Hello, World!";
    }

    @RequestMapping(path = "/login",
            method = RequestMethod.POST, produces =
            MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String login(HttpServletRequest request) {
        return "";
    }

    @RequestMapping(path = "/logout",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String logout(HttpServletRequest request) {
        return "";
    }
}
