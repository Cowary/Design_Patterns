package ru.cowary;

public class FileMessage implements MessageStrategy {

    @Override
    public byte[] enterMessage() {
        return new byte[0];
    }
}
