package Interfaces;

public class Main {
  public static void main(String[] args) {
    Human j = new Human();
    j.live();

    Interface l = new Human();
    l.live();
    ((Human)l).work();                    // Casting
  }
}
