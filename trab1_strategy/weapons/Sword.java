package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.Slash;

public class Sword extends Weapon {

  public Sword() {
    super("sword", 26, new Slash());
  }

}
