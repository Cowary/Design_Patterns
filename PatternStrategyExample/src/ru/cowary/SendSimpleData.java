package ru.cowary;

public class SendSimpleData implements SendStrategy {

    @Override
    public void sendMessage(String name, byte[] arr) {

    }

    @Override
    public String messagingDetails() {
        System.out.println("Незашеврованные данные отправлены");
        return null;
    }
}
