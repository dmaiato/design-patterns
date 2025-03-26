package trab1_strategy.weapons.behaviours;

public class Ranged implements I_AttackBehaviour {

  @Override
  public String attackProperties() {
    return "ranged attack inflicts fear!";
  }

}
