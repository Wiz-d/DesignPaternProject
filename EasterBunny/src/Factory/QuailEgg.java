package Factory;

public class QuailEgg extends Egg {

    public QuailEgg(){
        this.type = EggType.QUAIL;
    }

    protected void addDecoration(String decoration) {
        this.decorations.add(decoration);
    }

}
