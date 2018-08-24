package edu.solid.isp.smell;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ClientIsp {

  public static void main(String[] args) {
    System.out.println("ISP principle");

    Athlete athlete = new Athlete("David");
    athlete.jump();
    athlete.run();
    athlete.swim();

    Athlete athleteWheels = new WheelAthlete("Steven");

    try {
      athleteWheels.run();
      athleteWheels.jump();
      athleteWheels.swim();
    } catch (NotImplementedException nie) {}
  }
}
