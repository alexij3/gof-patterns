package com.buzilov.patterns.behavioral.mediator;

public class ChatSession implements Mediator<User> {
    @Override
    public void notify(User sender, String msg) {
        showMessageToUsersInChat(sender, msg);
    }

    void showMessageToUsersInChat(User user, String msg) {
        System.out.printf("[%s]: " + msg + "%n", user.getUsername());
    }
}
