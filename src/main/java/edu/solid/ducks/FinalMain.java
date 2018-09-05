package edu.solid.ducks;

import edu.solid.ducks.behaviors.DisplayDogBehavior;
import edu.solid.ducks.behaviors.LongQuack;
import edu.solid.ducks.behaviors.NoFlyBehavior;
import edu.solid.ducks.behaviors.QuackBehavior;
import edu.solid.ducks.behaviors.ShortFlyBehavior;
import java.util.Arrays;

public class FinalMain {

  public static void main(String[] args) {
    StarDuck mallardDuck = new StarDuck();
    mallardDuck.setFlyableBehavior(new ShortFlyBehavior());
    mallardDuck.setQuackBehavior(new LongQuack());

    StarDuck rubberDuck = new StarDuck();
    rubberDuck.setQuackBehavior(new LongQuack());

    StarDuck decoyDuck = new StarDuck();

    StarDuck dog = new StarDuck();
    dog.setQuackBehavior(
        new QuackBehavior() {
          @Override
          public void quack() {
            System.out.println("Wau wau");
          }
        });
    dog.setFlyableBehavior(new NoFlyBehavior());
    dog.setDisplayBehavior(new DisplayDogBehavior());

    Arrays.asList(mallardDuck, rubberDuck, decoyDuck, dog)
        .forEach(StarDuck::play);
  }
}
