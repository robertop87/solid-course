package edu.alenasoft.solid.ocp;

import java.util.List;

public class AreaCalculator {

  public void calcAreas(List<Rectangle> rectangles) {
    for (Rectangle rectangle: rectangles) {
      System.out.printf("Area: %d\n",
          rectangle.getWidth()*rectangle.getHeight());
    }
  }
}
