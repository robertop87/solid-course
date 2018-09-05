package edu.solid.ducks.behaviors;

public class DisplayDogBehavior implements DisplayBehavior {

  @Override
  public void display() {
    System.out.println("Show a dog");
  }
}
