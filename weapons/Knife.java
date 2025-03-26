package weapons;

import weapons.behaviours.Slash;

public class Knife extends Weapon {

  public Knife() {
    super("knife", 19, new Slash());
  }

}
