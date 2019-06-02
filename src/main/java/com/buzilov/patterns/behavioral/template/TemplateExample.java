package com.buzilov.patterns.behavioral.template;

public class TemplateExample {
    public static void main(String[] args) {
        String recipient = "vasya";
        String topic = "Welcome words";
        String body = "Welcome to our application!";

        MessagingService emailMessagingService = new EmailMessagingService();
        MessagingService personalMessaingService = new PersonalMessagingService();

        emailMessagingService.sendMessage(topic, body, recipient);
        personalMessaingService.sendMessage(topic, body, recipient);
    }
}
