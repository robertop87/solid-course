package edu.solid.ducks.behaviors;

public class NoFlyBehavior implements FlyableBehavior {

  @Override
  public void fly() {
    System.out.println("stay on the floor");
  }
}
