package ru.otus.example.advancedconfigurationdemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.otus.example.advancedconfigurationdemo.services.GreetingService;

@Controller
public class GreetingController {
    private final GreetingService singletonGreetingService;
    private final GreetingService prototypeGreetingService1;
    private final GreetingService prototypeGreetingService2;
    private final GreetingService sessionGreetingService;
    private final GreetingService requestGreetingService;


    public GreetingController(@Qualifier("SingletonGreetingServiceImpl") GreetingService singletonGreetingService,
                              @Qualifier("PrototypeGreetingServiceImpl")GreetingService prototypeGreetingService1,
                              @Qualifier("PrototypeGreetingServiceImpl")GreetingService prototypeGreetingService2,
                              @Qualifier("SessionGreetingServiceImpl")GreetingService sessionGreetingService,
                              @Qualifier("RequestGreetingServiceImpl")GreetingService requestGreetingService) {
        this.singletonGreetingService = singletonGreetingService;
        this.prototypeGreetingService1 = prototypeGreetingService1;
        this.prototypeGreetingService2 = prototypeGreetingService2;
        this.sessionGreetingService = sessionGreetingService;
        this.requestGreetingService = requestGreetingService;
    }

    @GetMapping("/")
    public String greetingPage(Model model) {
        model.addAttribute("singletonGreeting", singletonGreetingService.greeting());
        model.addAttribute("prototype1Greeting", prototypeGreetingService1.isFirstGreetingSuccess()? prototypeGreetingService2.greeting(): "Пока жду");
        model.addAttribute("prototype2Greeting", prototypeGreetingService1.greeting());
        model.addAttribute("sessionGreeting", sessionGreetingService.greeting());
        model.addAttribute("requestGreeting", requestGreetingService.greeting());
        return "index";
    }
}
