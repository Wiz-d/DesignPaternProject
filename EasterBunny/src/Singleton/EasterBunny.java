package Singleton;

import Decorator.ColorDecorator;
import Decorator.StickerDecorator;
import Factory.Factory;
import Observer.Basket;
import Factory.*;
import java.util.Random;

public class EasterBunny {

    private static EasterBunny instance;

    private EasterBunny(){}

    public static EasterBunny getInstance(){
        if(instance == null) {
            instance = new EasterBunny();
        }
        return instance;
    }

    public static void AddColor(Egg egg, Basket basket){
        Random random = new Random();
        int rn = random.nextInt(3);
        ColorDecorator decorator = new ColorDecorator();
        if(rn == 0){
            decorator.decorate(egg,"blue");
        }
        if(rn == 1){
            decorator.decorate(egg,"green");
        }
        if(rn == 2){
            decorator.decorate(egg,"purple");
        }

        basket.increaseCount();

    }

    public static void AddSticker(Egg egg, Basket basket){
        Random random = new Random();
        int rn = random.nextInt(3);
        StickerDecorator decorator = new StickerDecorator();
        if(rn == 0){
            decorator.decorate(egg,"kitty");
        }
        if(rn == 1){
            decorator.decorate(egg,"puppy");
        }
        if(rn == 2){
            decorator.decorate(egg,"turtle");
        }

        basket.increaseCount();
    }

    public static Egg getChickenEgg(EggFactory EggFactory){
        return EggFactory.createEgg(EggType.CHICKEN);
    }

    public static Egg getDinosaurEgg(EggFactory EggFactory){
        return EggFactory.createEgg(EggType.DINOSAUR);
    }

    public static Egg getQuailEgg(EggFactory EggFactory){
        return EggFactory.createEgg(EggType.QUAIL);
    }

}
