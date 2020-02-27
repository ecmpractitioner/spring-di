package net.sagati.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {

        return "Greetings - Setter";
    }
}
