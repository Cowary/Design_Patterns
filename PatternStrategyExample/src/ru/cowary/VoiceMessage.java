package ru.cowary;

public class VoiceMessage implements MessageStrategy{
    @Override
    public byte[] enterMessage() {
        return new byte[0];
    }
}
