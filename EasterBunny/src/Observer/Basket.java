package Observer;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Observable {

    private List<Observer> observerList;
    private int count=0;

    public Basket(){
        this.observerList = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observerList.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observerList.remove(observer);
        observer.setTopic(null);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.observerList) {
            observer.update();
        }
    }

    public void increaseCount(){
        count++;
    }

    @Override
    public int getUpdate() {
        return count;
    }
}
