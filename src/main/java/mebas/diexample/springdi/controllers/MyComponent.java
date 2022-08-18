package mebas.diexample.springdi.controllers;

import mebas.diexample.springdi.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final GreetingService greetingService;

    public MyComponent(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
