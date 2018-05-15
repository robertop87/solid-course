package edu.alenasoft.solid.ocp;

import java.util.List;

public class AreaCalculator {

  public static void calcAreas(List<Shape> shapes) {
    for (Shape shape: shapes) {
      System.out.printf("Area: %d\n", shape.getArea());
    }
  }
}
