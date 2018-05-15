package edu.alenasoft.solid.ocp;

import java.util.List;

public class TangeableCalculator {

  public static void calcTangs(List<Shape> shapes) {
    for (Shape shape: shapes) {
      System.out.printf("Perimeter: %d\n", shape.getTang());
    }
  }
}
