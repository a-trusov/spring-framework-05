package ru.otus.example.advancedconfigurationdemo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Qualifier("Friend2")
@Component
@Profile("Аня")
public class FriendAnna implements Friend {
    @Override
    public String getName() {
        return "Аня";
    }
}
