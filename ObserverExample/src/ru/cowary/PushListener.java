package ru.cowary;

public class PushListener implements Listener {
    @Override
    public void notify(String event, String message) {
        System.out.println("New " + event + " : " + message);
    }
}
