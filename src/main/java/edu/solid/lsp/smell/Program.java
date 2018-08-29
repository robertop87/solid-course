package edu.solid.lsp.smell;

import java.util.Arrays;
import java.util.List;

public class Program {

  public static void main(String[] args) {
    //Rectangle rectangle = new Rectangle(15, 30);
    //Square square = new Square();

    calcRectangles();
    //calcSquares();
    //calcTrianglesgles();
  }

  private static void calcRectangles() {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(15);
    rectangle.setWidth(15);

    Rectangle square = new Square();
    square.setWidth(50);
    square.setHeight(20);

    List<Rectangle> rectangles = Arrays.asList(rectangle, square);

    for (Rectangle rect : rectangles) {
      System.out.println(rect.area());
    }
  }
}
