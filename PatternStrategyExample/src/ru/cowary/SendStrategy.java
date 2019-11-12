package ru.cowary;

public interface SendStrategy {
    void sendMessage(String name, byte[] arr);
    String messagingDetails();
}
