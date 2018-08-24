package edu.solid.isp.smell;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WheelAthlete extends Athlete {

  public WheelAthlete(String name) {
    super(name);
  }

  @Override
  public void jump() {
    throw new NotImplementedException();
  }

  @Override
  public void swim() {
    throw new NotImplementedException();
  }
}
