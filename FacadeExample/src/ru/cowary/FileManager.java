package ru.cowary;


import java.util.Scanner;

public class FileManager {
    Scanner sc = new Scanner(System.in);
    String name;

    public String readName(){
        System.out.println("Введите имя файла для бэкапа");
        name = sc.nextLine();
        return name;
    }
    public String writeName(){
        System.out.println("Введите имя файла для скачивания с сервера");
        name = sc.nextLine();
        return name;
    }

    public byte[] readFile(){

        System.out.println("Считывание файла с диска");
        return null;
    }
    public void writeFile(byte[] mes){
        System.out.println("Запись файла на диск");
    }
}
