package weapons;

import weapons.behaviours.Slash;

public class Axe extends Weapon {

  public Axe() {
    super("axe", 27, new Slash());
  }

}