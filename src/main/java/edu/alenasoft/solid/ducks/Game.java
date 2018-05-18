package edu.alenasoft.solid.ducks;

public class Game {

  public static void main(String[] args) {

    Animal[] ducks = new Animal[4];
    ducks[0] = new LiveDuck(new LiveDuckDisplayBehavior(), new LiveDuckSwimBehavior(),
        new FlyBehavior() {
          @Override
          public void fly() {
            System.out.println("Fly Pato");
          }
        }, new QuackBehavior() {
      @Override
      public void quack() {
        System.out.println("Quack Pato");
      }
    });
    ducks[1] = new LiveDuck(new DisplayBehavior() {
      @Override
      public void display() {
        System.out.println("Pato fantasma");
      }
    }, new SwimBehavior() {
      @Override
      public void swim() {
        System.out.println("Swim Pago Fantasma");
      }
    },
        new FlyBehavior() {
          @Override
          public void fly() {
            System.out.println("Fly Pago Fantasma");
          }
        }, new QuackBehavior() {
      @Override
      public void quack() {
        System.out.println("Quack Pago Fantasma");
      }
    });
    ducks[2] = new LiveDuck(new DisplayBehavior() {
      @Override
      public void display() {
        System.out.println("Mostrar pato de madera");
      }
    }, new SwimBehavior() {
      @Override
      public void swim() {
        System.out.println("Swim pato de madera");
      }
    },
        new FlyBehavior() {
          @Override
          public void fly() {
            System.out.println("Fly pato de madera");
          }
        }, new QuackBehavior() {
      @Override
      public void quack() {
        System.out.println("Quack pato de madera");
      }
    });
    ducks[3] = new LiveFish(new DisplayBehavior() {
      @Override
      public void display() {
        System.out.println("pescado mostrado");
      }
    },
        new SwimBehavior() {
          @Override
          public void swim() {
            System.out.println("pescado nadando");
          }
        });
    for (int i = 0; i < ducks.length; i++) {
      ducks[i].play();
    }
  }
}
