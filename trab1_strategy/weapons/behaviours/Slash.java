package trab1_strategy.weapons.behaviours;

public class Slash implements I_AttackBehaviour {

  @Override
  public String attackProperties() {
    return "slash attack inflicts bleeding!";
  }

}
