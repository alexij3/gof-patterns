package com.buzilov.patterns.behavioral.template;

public class Message {
    private String topic;
    private String body;
    private String recipient;

    public Message() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Message{" +
                "topic='" + topic + '\'' +
                ", body='" + body + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
