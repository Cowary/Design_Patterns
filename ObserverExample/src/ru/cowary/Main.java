package ru.cowary;

public class Main {

    public static void main(String[] args) {
	    Twitter twitter = new Twitter();
	    twitter.manager.subscribe("Tweet", new PushListener());
	    twitter.manager.subscribe("Message", new EmailListener());

	    twitter.newTweet("text1");
	    twitter.newMessage("text2");
    }
}
