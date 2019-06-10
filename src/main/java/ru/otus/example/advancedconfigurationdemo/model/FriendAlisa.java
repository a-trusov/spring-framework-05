package ru.otus.example.advancedconfigurationdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Qualifier("Friend1")
@Component
@ConditionalOnProperty(name = "condition.friend", havingValue = "Алиса")
public class FriendAlisa implements Friend {
    @Override
    public String getName() {
        return "Алиса";
    }
}
