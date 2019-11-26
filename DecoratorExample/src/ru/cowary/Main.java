package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    Network network = new Network();
	    Messenger messenger;

	    System.out.println("Текстовый мессенджер");
	    messenger = new TextMessenger(network);
	    messenger.sendMessage();

	    System.out.println("АудиоМессенджер");
	    messenger = new AudioMessenger(network);
	    messenger.sendMessage();
    }
}
