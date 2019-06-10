package ru.otus.example.advancedconfigurationdemo.services;


import org.springframework.beans.factory.annotation.Value;

public abstract class AbstractGreetingServiceImpl implements GreetingService {

    @Value("${greetings.first-greeting}")
    private String firstGreeting;

    @Value("${greetings.re-greeting}")
    private String reGreeting;

    private boolean isFirstGreetingSuccess;

    public AbstractGreetingServiceImpl() {
        this.isFirstGreetingSuccess = false;
    }

    @Override
    public boolean isFirstGreetingSuccess() {
        return isFirstGreetingSuccess;
    }

    @Override
    public String greeting() {
        return currentGreeting();
    }

    @Override
    public String greetingPersonal(String name) {

        return String.format("%s %s", currentGreeting(), name);
    }

    private synchronized String currentGreeting() {
        String greeting = isFirstGreetingSuccess ? reGreeting : firstGreeting;
        isFirstGreetingSuccess = true;
        return greeting;
    }
}
