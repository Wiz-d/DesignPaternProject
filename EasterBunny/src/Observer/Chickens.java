package Observer;

public class Chickens implements  Observer{

    private Observable topic;

    public Chickens(){

    }
    @Override
    public void update() {
        System.out.println("Яйцата са готови!!! - Казало пиленцето");
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }
}
