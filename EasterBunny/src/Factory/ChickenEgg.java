package Factory;

public class ChickenEgg extends Egg {

    public ChickenEgg(){
        this.type = EggType.CHICKEN;
    }

    @Override
    protected void addDecoration(String decoration) {
        this.decorations.add(decoration);
    }
}
