package ru.otus.example.advancedconfigurationdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Qualifier("Friend1")
@Component
@ConditionalOnProperty(name = "condition.friend", havingValue = "Игорь")
public class FriendIgor implements Friend {
    @Override
    public String getName() {
        return "Игорь";
    }
}
