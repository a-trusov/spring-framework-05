package ru.otus.example.advancedconfigurationdemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Qualifier("PrototypeGreetingService")
@Scope("prototype")
@Service
public class PrototypeGreetingServiceImpl extends AbstractGreetingServiceImpl {
}
