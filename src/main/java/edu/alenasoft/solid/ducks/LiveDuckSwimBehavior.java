package edu.alenasoft.solid.ducks;

public class LiveDuckSwimBehavior implements SwimBehavior {

  @Override
  public void swim() {
    System.out.println("Swim live duck");
  }
}
