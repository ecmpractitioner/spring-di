package net.sagati.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {

        System.out.println("In Greetings class");
        return "Greetings - Setter";
    }
}
