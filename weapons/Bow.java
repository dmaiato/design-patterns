package weapons;

import weapons.behaviours.Ranged;

public class Bow extends Weapon {

  public Bow() {
    super("bow", 17, new Ranged());
  }

}
