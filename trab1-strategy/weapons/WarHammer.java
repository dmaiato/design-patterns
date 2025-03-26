package weapons;

import weapons.behaviours.Blunt;

public class WarHammer extends Weapon {

  public WarHammer() {
    super("warhammer", 32, new Blunt());

  }

}
