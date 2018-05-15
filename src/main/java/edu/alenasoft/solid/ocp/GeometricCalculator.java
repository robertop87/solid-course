package edu.alenasoft.solid.ocp;

import java.util.List;

public class GeometricCalculator {

  public void calcAreas(List<Shape> shapes) {
    AreaCalculator.calcAreas(shapes);
  }

  public void calcPerimeters(List<Shape> shapes) {
    PerimeterCalculator.calcPerimeter(shapes);
  }
}
