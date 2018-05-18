package edu.alenasoft.solid.ducks;

public class LiveFish implements Fish {
  private DisplayBehavior displayBehavior;
  private SwimBehavior swimBehavior;

  public LiveFish(DisplayBehavior displayBehavior,
      SwimBehavior swimBehavior) {
    this.displayBehavior = displayBehavior;
    this.swimBehavior = swimBehavior;
  }

  @Override
  public void play() {
    displayBehavior.display();
    swimBehavior.swim();
  }
}
