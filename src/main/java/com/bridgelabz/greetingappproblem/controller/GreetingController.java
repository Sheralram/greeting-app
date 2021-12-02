package com.bridgelabz.greetingappproblem.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose : Greeting Controller to Solve Diffferent Methods
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@RestController
public class GreetingController {

    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return hello message
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody String message ){
        return "Message:" + message;
    }



}
