package net.sagati.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {
        return "Greetings - Constructor";
    }
}
