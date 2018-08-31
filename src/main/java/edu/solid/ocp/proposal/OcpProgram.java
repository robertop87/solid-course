package edu.solid.ocp.proposal;

import java.util.Arrays;
import java.util.List;

public class OcpProgram {

  public static void main(String[] args) {
    Shape rectangle = new Shape(new RectangleAreaBehavior(50, 50));
    Shape circle = new Shape(new CircleAreaBehavior(50));
    Shape awesome = new Shape(new Areable() {
      @Override
      public double area() {
        // Add here your algorithm
        return 57;
      }
    });

    List<Shape> shapes = Arrays.asList(rectangle, circle, awesome);
    shapes.forEach(Shape::printArea);
  }
}
