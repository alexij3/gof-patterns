package com.buzilov.patterns.behavioral.mediator;

public class MediatorExample {
    public static void main(String[] args) {
        User simpleUser = new SimpleUser("vasya", "123");
        User admin = new Admin("admin", "admin");

        ChatSession chatSession = new ChatSession();

        simpleUser.setMediator(chatSession);
        admin.setMediator(chatSession);

        simpleUser.sendMessage("Hello, I am simple user");
        admin.sendMessage("Hi. I am admin.");
    }
}
