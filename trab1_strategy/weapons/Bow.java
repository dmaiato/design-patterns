package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.Ranged;

public class Bow extends Weapon {

  public Bow() {
    super("bow", 17, new Ranged());
  }

}
