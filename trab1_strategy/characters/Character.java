package trab1_strategy.characters;

import trab1_strategy.weapons.Weapon;

public abstract class Character {
  protected String char_class;
  protected Weapon weapon;

  public Character(String char_class) {
    this.char_class = char_class;
    this.weapon = null;
  }

  public void pickupWeapon(Weapon weapon) {
    if (this.weapon == null) {
      this.weapon = weapon;
      System.out.println("new weapon acquired: " + weapon);
      return;
    }

  }

  public void dropWeapon() {
    if (this.weapon != null) {
      System.out.println("dropped: " + weapon);
      this.weapon = null;
      return;
    }
  }

  public String getChar_class() {
    return char_class;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  @Override
  public String toString() {
    return "class: " + char_class + ", weapon: " + weapon;
  }

}
