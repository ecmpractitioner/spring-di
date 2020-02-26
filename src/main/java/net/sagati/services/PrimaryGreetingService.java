package net.sagati.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String getGreetings() {
        return "Primary Greeting service";
    }
}
