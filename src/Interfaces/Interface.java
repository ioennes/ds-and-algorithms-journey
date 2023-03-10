package Interfaces;

// An interface is a collection of abstract methods and constants, it guarantees that the
// Child class will use all them.

public interface Interface {
  public final int MAX_AGE = 150;
  public abstract void live();
  public abstract void die();
}
