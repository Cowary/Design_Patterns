package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    UserData userData_1 = new UserData("ivan", "123", 0);
	    UserData userData_2 = new UserData("kate", "345", 1);
	    UserData userData_clone = userData_1.clone();

	    System.out.println("Являются ли обьекты одинаковыми user_Data_1 и userData_clone = " + userData_clone.equals(userData_1));
        System.out.println("Являются ли обьекты одинаковыми user_Data_2 и userData_clone = " + userData_clone.equals(userData_2));
    }
}
