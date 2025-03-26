package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.Blunt;

public class WarHammer extends Weapon {

  public WarHammer() {
    super("warhammer", 32, new Blunt());

  }

}
