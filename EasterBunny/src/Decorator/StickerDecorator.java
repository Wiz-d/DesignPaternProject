package Decorator;

import Factory.Egg;

public class StickerDecorator extends EggDecorator {

    @Override
    public void decorate(Egg decoratedEgg, String sticker) {
        decoratedEgg.getDecorations().add(sticker);
    }

}
