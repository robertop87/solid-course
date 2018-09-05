package edu.solid.ducks;

import edu.solid.ducks.behaviors.QuackBehavior;

public class RubberDuck extends Duck implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeezee");
  }
}
