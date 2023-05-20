import Factory.Egg;
import Factory.EggFactory;
import Observer.Basket;
import Observer.Chickens;
import Singleton.EasterBunny;

import java.util.Random;

public class Main {

    public static void randomColorOrSticker(EasterBunny bunny,Egg egg,Basket basket){
        Random random = new Random();
        int rn = random.nextInt(2);
        if(rn>0){
            bunny.AddColor(egg, basket);
        }
        else {
            bunny.AddSticker(egg,basket);
        }
    }

    public static void main(String[] args) {
        EasterBunny bunny = EasterBunny.getInstance();
        EggFactory factory = new EggFactory();

        Basket basket = new Basket();

        Chickens obs1 = new Chickens();
        Chickens obs2 = new Chickens();
        Chickens obs3 = new Chickens();

        basket.subscribe(obs1);
        basket.subscribe(obs2);
        basket.subscribe(obs3);

        Egg egg1 = bunny.getChickenEgg(factory);
        randomColorOrSticker(bunny,egg1,basket);

        Egg egg2 = bunny.getDinosaurEgg(factory);
        randomColorOrSticker(bunny,egg2,basket);

        Egg egg3 = bunny.getQuailEgg(factory);
        randomColorOrSticker(bunny,egg3,basket);

        Egg egg4 = bunny.getDinosaurEgg(factory);
        randomColorOrSticker(bunny,egg4,basket);

        Egg egg5 = bunny.getChickenEgg(factory);
        randomColorOrSticker(bunny,egg5,basket);

        Egg egg6 = bunny.getQuailEgg(factory);
        randomColorOrSticker(bunny,egg6,basket);


        if(basket.getUpdate()>5){
            basket.notifyObservers();
        }

        System.out.println("The end!");

    }

}
