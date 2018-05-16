package edu.alenasoft.solid.ducks;

public class LiveDuck implements Duck {
  private DisplayBehavior displayBehavior;
  //private QuackBehavior quackBehavior;

  public LiveDuck(DisplayBehavior displayBehavior) {
    this.displayBehavior = displayBehavior;
  }

  @Override
  public void play()
  {
    this.displayBehavior.display();
    //this.quackBehavior.quack();
  }
}
