package ru.cowary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    private Map<String, List<Listener>> listMap= new HashMap<>();

    public void addEvent(String event){
        listMap.put(event, new ArrayList<>());
    }
    public void deleteEvent(String event){
        listMap.remove(event);
    }
    public void EventPrint(){
        System.out.println(listMap.keySet().toString());
    }
    public void subscribe(String event, Listener listener){
        listMap.get(event).add(listener);
    }
    public void unsubscribe(String event, Listener listener){
        listMap.get(event).remove(listener);
    }
    public void notifyListener(String event, String message){
        for (Listener listener: listMap.get(event)) {
            listener.notify(event, message);
        }
    }
}
