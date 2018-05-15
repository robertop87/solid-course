package edu.alenasoft.solid.ocp;

import java.util.List;

public class PerimeterCalculator {

  public static void calcPerimeter(List<Shape> shapes) {
    for (Perimeterable shape: shapes) {
      System.out.printf("Perimeter: %d\n", shape.getPerimeter());
    }
  }
}
