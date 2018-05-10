package edu.alenasoft.solid.ocp;

import java.util.List;

public class CircleAreaCalculator {

  public void calcCircleArea(List<Circle> circles) {
    for (Circle circle: circles) {
      System.out.printf("Area: %d\n",
          2*Math.PI*circle.getRadius()*circle.getRadius());
    }
  }
}
