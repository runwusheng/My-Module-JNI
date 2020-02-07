package com.example.messageprovider;

// This is the class inside Java library module
public class MessageProvider {

    private int messageType;

    public MessageProvider(int messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        switch (messageType) {
            case 0:
                return "Hello, world!";

            case 1:
                return "Uncle Bob!";

            default:
                return "Default message";
        }
    }
}
