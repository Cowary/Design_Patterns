package ru.cowary;

import java.awt.*;
import java.util.Scanner;

public class Main {

    static int size = 1000;
    static int count_spaships = 10000000;


    public static void main(String[] args) {
        long before = mem();
        Fleet fleet = new Fleet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру '1 ' для создания флота космических кораблей с использованием паттерна легковес");
        System.out.println("Введите цифру '2' для создание флота космических кораблей без использования паттерна");
        if(scanner.nextInt() == 1){
            for(int i = 0; i < count_spaships; i++){
                fleet.placeFleet(random(0,size/2-20), random(10, size), "starfighterAlly", Color.GREEN, "starfighterAlly_spaceship_data");
                fleet.placeFleet(random(size/2 + 20, size), random(10, size), "starfighterEnemy", Color.DARK_GRAY, "starfighterEnemy_spaceship_data");
            }
        }else{
            for (int i = 0; i < count_spaships; i++){
                fleet.placeFleetNO_FLYWEIGHT(random(0,size/2-20), random(10, size), "alienSpaceshipAlly", Color.GREEN, "alienSpaceshipAlly_AlienSpaceship_data");
                fleet.placeFleetNO_FLYWEIGHT(random(size/2+20,size), random(10, size), "alienSpaceshipEnemy", Color.DARK_GRAY, "alienSpaceshipeEnemy_AlienSpaceship_data");
            }
        }
        long after = mem();
        System.out.println("Занято памяти до создания флота = " + before);
        System.out.println("Занято памяти после создание флома = " + after);
        System.out.println("Разница памяти = " + (after - before));


        fleet.setSize(size, size);
        fleet.setVisible(true);


    }

    private static int random(int min, int max){
        return min + (int)(Math.random()* ((max - min) + 1));
    }
    public static long mem(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("freeMemory = " + runtime.freeMemory()/(1024*1024));
        return (runtime.totalMemory() - runtime.freeMemory())/(1024*1024);
    }
}
