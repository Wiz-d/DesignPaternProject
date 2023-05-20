package Factory;

public class DinosaurEgg extends Egg {

    public DinosaurEgg(){
        this.type = EggType.DINOSAUR;
    }

    protected void addDecoration(String decoration) {
        this.decorations.add(decoration);
    }

}
