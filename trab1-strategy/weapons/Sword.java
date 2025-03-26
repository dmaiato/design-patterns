package weapons;

import weapons.behaviours.Slash;

public class Sword extends Weapon {

  public Sword() {
    super("sword", 26, new Slash());
  }

}
