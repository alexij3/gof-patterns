package com.buzilov.patterns.structural.bridge;

import java.util.Arrays;
import java.util.List;

public class BridgeExample {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new SimpleUser("vasya simple", "123", new BeginnerPackFunctionality()),
                                        new ContentManager("content manager", "123", new IntermediatePackFunctionality()),
                                        new Admin("admin", "admin", new ProfessionalPackFunctionality()));

        for (User user : users) {
            user.doAdditionalFunctionality();
        }
    }
}
