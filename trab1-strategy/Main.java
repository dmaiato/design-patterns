import java.util.Map;
import java.util.Scanner;

import characters.*;
import characters.Character;
import weapons.Axe;
import weapons.Bow;
import weapons.Knife;
import weapons.Sword;
import weapons.WarHammer;
import weapons.Weapon;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Map<Integer, Character> classMap = Map.of(
        1, new King(),
        2, new Queen(),
        3, new Knight());

    Map<Integer, Weapon> weaponMap = Map.of(
        1, new Axe(),
        2, new Bow(),
        3, new Knife(),
        4, new Sword(),
        5, new WarHammer());

    System.out.println("========== RPG GAME ==========");
    System.out.println("1. King");
    System.out.println("2. Queen");
    System.out.println("3. Knight");
    System.out.print("Choose your class: ");
    Character player = classMap.get(Integer.parseInt(scanner.nextLine()));

    int option = 0;

    while (option != 5) {
      System.out.println("-----------------------\n");

      System.out.println("1. View character");
      System.out.println("2. Attack");
      System.out.println("3. Choose weapon");
      System.out.println("4. Drop weapon");
      System.out.println("5. Leave game");
      System.out.print("Option: ");
      option = Integer.parseInt(scanner.nextLine());

      System.out.println("\n-----------------------");
      switch (option) {
        case 1 -> {
          System.out.println(player);
          break;
        }

        case 2 -> {
          if (player.getWeapon() == null) {
            System.out.println("you fling your arms around and miss every hit... try getting a weapon");
            break;
          }

          System.out.println(player.getWeapon().attackProperties());
          break;
        }

        case 3 -> {
          if (player.getWeapon() != null) {
            System.out.println("warning: a weapon is already equipped!");
            break;
          }

          System.out.println();

          System.out.println("1. Axe");
          System.out.println("2. Bow");
          System.out.println("3. Knife");
          System.out.println("4. Sword");
          System.out.println("5. WarHammer");
          System.out.print("Choose a weapon: ");
          Weapon weapon = weaponMap.get(Integer.parseInt(scanner.nextLine()));
          
          System.out.println("\n-----------------------");

          player.pickupWeapon(weapon);
          break;
        }

        case 4 -> {
          if (player.getWeapon() == null) {
            System.out.println("warning: no weapon equipped!");
            break;
          }

          player.dropWeapon();
          break;
        }

        case 5 -> {
          return;
        }

        default -> {
          System.out.println("error: invalid option");
        }
      }

    }
    scanner.close();

    System.out.println("========== THE END ==========");
  }
}