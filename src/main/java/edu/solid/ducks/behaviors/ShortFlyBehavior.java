package edu.solid.ducks.behaviors;

public class ShortFlyBehavior implements FlyableBehavior {

  @Override
  public void fly() {
    System.out.println("Short Fly");
  }
}
