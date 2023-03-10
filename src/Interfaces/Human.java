package Interfaces;

public class Human implements Interface {
  public void live() {
    System.out.println("Alive");
  } 
  public void die() {
    System.out.print("Dead");
  }
  public void work() {
    System.out.println("Works");
  }
}
