package edu.alenasoft.solid.ducks;

public class Game {

  public static void main(String[] args) {
//    Duck[] ducks = new Duck[3];
//
//
//
//    ducks[0] = new MallardDuck();
//    ducks[1] = new RedHeadDuck();
//    ducks[2] = new RubberDuck();

    /*for (int i = 0; i < ducks.length; i++) {
      ducks[i].swim();
      ducks[i].quack();
      ducks[i].display();
      ducks[i].fly();
    }*/

    Duck[] ducks = new Duck[3];
    ducks[0] = new LiveDuck(new LiveDuckDisplayBehavior());
    ducks[1] = new LiveDuck(new DisplayBehavior() {
      @Override
      public void display() {
        System.out.println("Pato fantasma");
      }
    });
    ducks[2] = new LiveDuck(new DisplayBehavior() {
      @Override
      public void display() {
        System.out.println("Mostrar pato de madera");
      }
    });
    for (int i = 0; i < ducks.length; i++) {
      ducks[i].play();
    }
  }
}
