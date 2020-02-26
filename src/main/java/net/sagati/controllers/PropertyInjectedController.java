package net.sagati.controllers;

import net.sagati.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreetings() {

        return this.greetingService.getGreetings();
    }
}
