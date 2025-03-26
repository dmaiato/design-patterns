package weapons.behaviours;

public class Blunt implements I_AttackBehaviour {

  @Override
  public String attackProperties() {
    return "blunt attack ignores armor!";
  }

}
