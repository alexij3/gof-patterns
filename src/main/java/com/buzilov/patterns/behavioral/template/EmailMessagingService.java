package com.buzilov.patterns.behavioral.template;

import com.buzilov.patterns.behavioral.mediator.User;

public class EmailMessagingService extends MessagingService {
    @Override
    boolean deliverMessage(Message builtMessage) {
        connectToMailServer();
        sendMessage(builtMessage);
        return true;
    }

    private void connectToMailServer() {
        System.out.println("Connecting to mail server...");
    }

    private void sendMessage(Message message) {
        System.out.println("-------Sending email-------");
        System.out.printf("To: %s%n", message.getRecipient());
        System.out.printf("Topic: %s%n", message.getTopic());
        System.out.println("Content:");
        System.out.println(message.getBody());
    }
}
