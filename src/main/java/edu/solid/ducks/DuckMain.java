package edu.solid.ducks;

public class DuckMain {

  public static void main(String[] args) {
    Duck mallardDuck = new MallardDuck();
    Duck rubberDuck = new RubberDuck();

    mallardDuck.display();
    ((MallardDuck) mallardDuck).quack();
    mallardDuck.swim();
    ((MallardDuck) mallardDuck).fly();

    ((RubberDuck) rubberDuck).quack();
  }
}
