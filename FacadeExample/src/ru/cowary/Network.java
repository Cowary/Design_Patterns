package ru.cowary;

public class Network {
    public void sendByte(byte[] mes, String name){
        System.out.println("Отправка файла " + name + " на сервер ввиде потока байтов ");
    }
    public byte[] getByte(String name){
        System.out.println("Скачивание файла " + name + " с сервера ввиде потока байтов ");
        return null;
    }
}
