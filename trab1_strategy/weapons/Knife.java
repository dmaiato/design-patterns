package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.Slash;

public class Knife extends Weapon {

  public Knife() {
    super("knife", 19, new Slash());
  }

}
