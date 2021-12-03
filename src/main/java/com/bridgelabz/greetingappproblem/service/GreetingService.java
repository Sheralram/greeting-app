package com.bridgelabz.greetingappproblem.service;

import com.bridgelabz.greetingappproblem.model.GreetingModel;
import com.bridgelabz.greetingappproblem.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Purpose : Greeting service
 *
 * @author : Ramkrishna Sheral
 * @version : 0.0.1
 * @since : 01-12-2021
 */
@Service
public class GreetingService {

    @Autowired
    GreetingRepository greetingRepository;

    public String greet(){
        return "Hello World";
    }

    public GreetingModel addGreeting (GreetingModel greetingModel){
        return greetingRepository.save(greetingModel);
    }

    public GreetingModel getGreetingById(int id) {
        Optional<GreetingModel> greetingModel = greetingRepository.findById(id);
        if(greetingModel.isPresent()){
            return greetingModel.get();
        }
        return null;
    }

}
