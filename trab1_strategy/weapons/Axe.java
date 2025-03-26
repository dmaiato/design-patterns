package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.Slash;

public class Axe extends Weapon {

  public Axe() {
    super("axe", 27, new Slash());
  }

}