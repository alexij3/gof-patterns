package com.buzilov.patterns.behavioral.template;

public abstract class MessagingService {
    void sendMessage(String topic, String body, String recipient) {
        Message message = buildMessage(topic, body, recipient);
        deliverMessage(message);
    }

    private Message buildMessage(String topic, String body, String recipient) {
        // Logic of building message.
        Message message = new Message();

        message.setTopic(topic);
        message.setBody(body);
        message.setRecipient(recipient);

        return message;
    }

    abstract boolean deliverMessage(Message builtMessage);
}
