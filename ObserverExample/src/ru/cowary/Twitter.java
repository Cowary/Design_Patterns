package ru.cowary;

public class Twitter {
    public Manager manager;

    Twitter(){
        manager = new Manager();
        manager.addEvent("Tweet");
        manager.addEvent("Message");
    }
    public void newTweet(String text){
        manager.notifyListener("Tweet", text);
    }
    public void newMessage(String text){
        manager.notifyListener("Message", text);
    }

}
