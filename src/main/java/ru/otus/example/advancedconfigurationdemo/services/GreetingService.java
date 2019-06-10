package ru.otus.example.advancedconfigurationdemo.services;

public interface GreetingService {
    boolean isFirstGreetingSuccess();
    String greeting();
    String greetingPersonal(String name);
}
