package ru.cowary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Messenger messenger;
	    System.out.println("Выберите тип отправляемого сообщение: \n" + "1 - Текстовое сообщение\n" +"2 - Файл");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("1") ){
            messenger = new TextMessager();
        }else {
            messenger = new FileMessenger();
        }
        messenger.inputAddressName();
        messenger.inputMessage();
        messenger.encryptMessage();
        messenger.sendMessage();
        messenger.getMessage();
        messenger.decryptMessage();
        messenger.outputMessage();


    }
}
