package Factory;

public class EggFactory extends Factory {

    @Override
    public Egg createEgg(EggType requiredType) {
        return switch (requiredType) {
            case CHICKEN -> new ChickenEgg();
            case DINOSAUR -> new DinosaurEgg();
            case QUAIL -> new QuailEgg();
        };
    }

}
