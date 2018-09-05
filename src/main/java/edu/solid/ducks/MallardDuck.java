package edu.solid.ducks;

import edu.solid.ducks.behaviors.FlyableBehavior;
import edu.solid.ducks.behaviors.QuackBehavior;

public class MallardDuck extends Duck implements FlyableBehavior, QuackBehavior {

  @Override
  public void fly() {
    System.out.println("Mallard duck flying");
  }

  @Override
  public void quack() {
    System.out.println("Quacking as Mallard");
  }
}
