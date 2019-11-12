package ru.cowary;

import java.util.Scanner;

public class Main {
    private static SendStrategy sendStrategy;
    private static MessageStrategy messageStrategy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.println("Введите имя отправителя");
	    String name = sc.nextLine();
	    System.out.println("Выберите, что отправить: " + "\n" + " 1 - Текстовое сообщение" +"\n "+ " 2 - Голосовое соощение" +"\n" + "3 - Файл");
	    int x = sc.nextInt();
        if(x == 1){
            messageStrategy = new TextMessage();
        }else if(x == 2){
            messageStrategy = new VoiceMessage();
        }else if(x == 3){
            messageStrategy = new FileMessage();
        }
        System.out.println("Требуется шифрование: Да/Нет" );
        String y = sc.next().toLowerCase().trim();
        if(y.equals("да")){
            sendStrategy = new SendEncryptedData();
        }else if(y.equals("нет")){
            sendStrategy = new SendSimpleData();
        }
        sendStrategy.sendMessage(name, messageStrategy.enterMessage());
        sendStrategy.messagingDetails();
    }
}
