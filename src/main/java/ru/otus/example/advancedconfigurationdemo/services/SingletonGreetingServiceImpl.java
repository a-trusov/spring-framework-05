package ru.otus.example.advancedconfigurationdemo.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Qualifier("SingletonGreetingServiceImpl")
@Scope("singleton")
@Service
public class SingletonGreetingServiceImpl extends AbstractGreetingServiceImpl {
}
