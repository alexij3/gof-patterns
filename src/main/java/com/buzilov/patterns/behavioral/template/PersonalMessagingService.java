package com.buzilov.patterns.behavioral.template;

import com.buzilov.patterns.behavioral.mediator.SimpleUser;
import com.buzilov.patterns.behavioral.mediator.User;

public class PersonalMessagingService extends MessagingService {

    @Override
    boolean deliverMessage(Message builtMessage) {
        User user = findRecipientInSystem(builtMessage.getRecipient());
        sendMessage(builtMessage, user);
        return true;
    }

    private User findRecipientInSystem(String recipientName) {
        // Finding recipient in online courses system by his name.
        return new SimpleUser(recipientName, "password");
    }

    private void sendMessage(Message message, User user) {
        System.out.println("-------Sending personal message-------");
        System.out.printf("To: %s%n", user.getUsername());
        System.out.printf("Topic: %s%n", message.getTopic());
        System.out.println("Content:");
        System.out.println(message.getBody());
    }
}
