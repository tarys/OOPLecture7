package ua.kpi.fpm.pma.oop.lecture7.observer;

import java.util.Observable;
import java.util.Observer;

public class MessageLogObserver implements Observer {
    @Override
    public void update(Observable obs, Object data) {
        System.out.println("Message to log: " + data);
    }
}
