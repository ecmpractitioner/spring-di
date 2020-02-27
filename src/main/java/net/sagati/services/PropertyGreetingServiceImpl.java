package net.sagati.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String getGreetings() {


        return "Greetings - Property";
    }
}
