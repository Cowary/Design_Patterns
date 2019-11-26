package ru.cowary;

public class AudioMessenger implements Messenger {
    Network network;

    AudioMessenger(Network network){
        this.network = network;
    }

    @Override
    public void sendMessage() {
        System.out.println("Отправка голосового сообщения");
        network.sendByte(null);
    }

    @Override
    public void getMessage() {
        network.getByte();
        System.out.println("Вывод голосового сообщения");
    }
}
