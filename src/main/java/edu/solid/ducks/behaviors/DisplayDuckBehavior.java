package edu.solid.ducks.behaviors;

public class DisplayDuckBehavior implements DisplayBehavior {

  @Override
  public void display() {
    System.out.println("Display abstract duck");
  }
}
