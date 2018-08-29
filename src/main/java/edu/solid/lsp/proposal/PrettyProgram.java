package edu.solid.lsp.proposal;

import java.util.Arrays;
import java.util.List;

public class PrettyProgram {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(15);
    rectangle.setWidth(35);

    Square square = new Square();
    square.setSize(30);

    List<Shape> shapes = Arrays.asList(rectangle, square);

    shapes.forEach(PrettyProgram::printShape);
  }

  public static void printShape(Shape shape) {
    System.out.println(shape.area());
  }
}
