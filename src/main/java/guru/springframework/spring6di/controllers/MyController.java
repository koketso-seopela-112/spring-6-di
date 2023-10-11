package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.GreetingService;
import guru.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        //Concrete implementation of Dependency injection
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("Im in the controller");
        return greetingService.sayGreeting();
    }
}
