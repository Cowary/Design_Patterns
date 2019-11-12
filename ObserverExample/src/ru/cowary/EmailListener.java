package ru.cowary;

public class EmailListener implements Listener{
    String email = "aaa@gmail.com";
    @Override
    public void notify(String event, String message) {
        System.out.println("Отправка " + event + " : " + message + " на " + email);
    }
}
