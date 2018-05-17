package edu.alenasoft.solid.ducks;

public class LiveDuck implements Duck {
  private DisplayBehavior displayBehavior;
  private SwimBehavior swimBehavior;
  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;
  public LiveDuck(DisplayBehavior displayBehavior,  SwimBehavior swimBehavior, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
    this.displayBehavior = displayBehavior;
    this.swimBehavior = swimBehavior;
    this.flyBehavior = flyBehavior;
    this.quackBehavior = quackBehavior;
  }

  @Override
  public void play()
  {
    this.displayBehavior.display();
    this.swimBehavior.swim();
    this.flyBehavior.fly();
    this.quackBehavior.quack();
  }
}
