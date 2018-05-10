package edu.alenasoft.solid.ocp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcpClient {

  public static void main(String[] args) {
    AreaCalculator areaCalculator = new AreaCalculator();
    List<Rectangle> rectangles = Arrays.asList(
        new Rectangle(5, 5),
        new Rectangle(4, 5),
        new Rectangle(3, 7),
        new Rectangle(6, 2)
    );

    areaCalculator.calcAreas(rectangles);

    // CircleAreaCalculator
  }
}
