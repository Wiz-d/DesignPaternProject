package Decorator;

import Factory.Egg;

public class ColorDecorator {

    public void decorate(Egg decoratedEgg, String color) {
        decoratedEgg.getDecorations().add(color);
    }

}
