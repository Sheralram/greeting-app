package com.bridgelabz.greetingappproblem.controller;

import com.bridgelabz.greetingappproblem.model.GreetingModel;
import com.bridgelabz.greetingappproblem.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Purpose : Greeting Controller to Solve Different Methods
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@RestController
public class GreetingController {

    @Autowired
    GreetingService greetingService;
    /**
     * Purpose : GET Request method is used to get greeting hello message from BridgeLabz using RestController
     *
     * @return hello message
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody String message ){
        return "Message:" + message;
    }
    /**
     * Purpose : GET Request method is used  and Extended Greeting Controller to use Service Layer to get Simple Greeting message : Hello World
     *
     * @return Hello World
     */
    @GetMapping(value="/greetmessage")
    public String Greeting(){
        return greetingService.greet();
    }
    /**
     * Purpose : Ability for the Greeting App to give Greeting message with First Name And Last Name
     *
     * @return FirstName And LastName
     */
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam String firstName, @RequestParam String lastName) {
        return "Hello : " + firstName + " " + lastName;
    }
    /**
     * Purpose : Ability for the Greeting App to save Greeting message in the Repository
     *
     * @return id,FirstName,LastName And Message
     */
     @PostMapping(value = "/addGreeting")
     public GreetingModel addStudent (@RequestBody GreetingModel greetingModel){
     return greetingService.addGreeting(greetingModel);
        }


}
