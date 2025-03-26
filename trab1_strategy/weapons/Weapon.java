package trab1_strategy.weapons;

import trab1_strategy.weapons.behaviours.*;

public abstract class Weapon {
  private String name;
  private double damage;
  protected I_AttackBehaviour weapon_class;

  public Weapon(String name, double damage, I_AttackBehaviour weapon_class) {
    this.name = name;
    this.damage = damage;
    this.weapon_class = weapon_class;
  }

  public String attackProperties() {
    return weapon_class.attackProperties();
  }

  @Override
  public String toString() {
    return name + " - " + damage + " damage";
  }

}
