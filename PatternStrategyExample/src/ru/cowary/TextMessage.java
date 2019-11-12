package ru.cowary;

public class TextMessage implements MessageStrategy {
    @Override
    public byte[] enterMessage() {
        return new byte[0];
    }
}
