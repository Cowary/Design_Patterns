package ru.cowary;

public class SendEncryptedData implements SendStrategy {

    @Override
    public void sendMessage(String name, byte[] arr) {

    }

    @Override
    public String messagingDetails() {
        System.out.println("Зашифрованные данные отправлены");
        return null;
    }
}
