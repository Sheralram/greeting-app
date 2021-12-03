package com.bridgelabz.greetingappproblem.service;

import com.bridgelabz.greetingappproblem.dto.GreetingDto;
import com.bridgelabz.greetingappproblem.model.GreetingModel;
import com.bridgelabz.greetingappproblem.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public String greet() {
        return "Hello World";
    }

    public GreetingModel addGreeting(GreetingDto greetingDto) {
        GreetingModel greetingModel = new GreetingModel();
        greetingModel.setMessage(greetingDto.getMessage());
        return greetingRepository.save(greetingModel);
    }

    public GreetingModel getGreetingById(int id) {
        Optional<GreetingModel> greetingModel = greetingRepository.findById(id);
        if (greetingModel.isPresent()) {
            return greetingModel.get();
        }
        return null;
    }

    public List<GreetingModel> greetings() {
        return greetingRepository.findAll();
    }

    public GreetingModel updateGreeting(int id, GreetingDto greetingDto) {
        Optional<GreetingModel> optionalGreetingModel = greetingRepository.findById(id);
        if (optionalGreetingModel.isPresent()) {
            GreetingModel greetingModel = optionalGreetingModel.get();
            greetingModel.setMessage(greetingDto.getMessage());
            return greetingRepository.save(greetingModel);
        }
        return null;
    }

    public String deleteGreeting(int id) {
        Optional<GreetingModel> greetingModel = greetingRepository.findById(id);
        if (greetingModel.isPresent()) {
            greetingRepository.delete(greetingModel.get());
            return "Record is deleted Successfully";
        }
        return "Record is not found";
    }
}
