package Factory;

import java.awt.*;
import java.util.ArrayList;

public abstract class Egg {

   protected ArrayList<String> decorations = new ArrayList<String>();
   protected EggType type = null;

   protected abstract void addDecoration(String decoration);

   public ArrayList<String> getDecorations() {
      return decorations;
   }

   public void setDecorations(ArrayList<String> decorations) {
      this.decorations = decorations;
   }
}
