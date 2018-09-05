package edu.solid.ducks;

import edu.solid.ducks.behaviors.DisplayBehavior;
import edu.solid.ducks.behaviors.DisplayDuckBehavior;
import edu.solid.ducks.behaviors.FlyableBehavior;
import edu.solid.ducks.behaviors.NoFlyBehavior;
import edu.solid.ducks.behaviors.QuackBehavior;
import edu.solid.ducks.behaviors.SilentQuack;

public class StarDuck {

  private QuackBehavior quackBehavior;
  private FlyableBehavior flyableBehavior;
  private DisplayBehavior displayBehavior;

  public StarDuck() {
    this.quackBehavior = new SilentQuack();
    this.flyableBehavior = new NoFlyBehavior();
    this.displayBehavior = new DisplayDuckBehavior();
  }

  public StarDuck(QuackBehavior quackBehavior,
      FlyableBehavior flyableBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyableBehavior = flyableBehavior;
  }

  public void play() {
    this.quackBehavior.quack();
    this.flyableBehavior.fly();
    this.displayBehavior.display();
  }

  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public FlyableBehavior getFlyableBehavior() {
    return flyableBehavior;
  }

  public void setFlyableBehavior(FlyableBehavior flyableBehavior) {
    this.flyableBehavior = flyableBehavior;
  }

  public DisplayBehavior getDisplayBehavior() {
    return displayBehavior;
  }

  public void setDisplayBehavior(DisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
  }
}
