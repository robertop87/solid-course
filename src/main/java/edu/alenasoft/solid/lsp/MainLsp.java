package edu.alenasoft.solid.lsp;

public class MainLsp {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(2);
    rectangle.setWidth(5);

    Square square = new Square();
    square.setSize(5);

    Triangle triangle = new Triangle();
    triangle.setBase(5);
    triangle.setHeight(15);

    showArea(rectangle);
    showArea(square);
    showArea(triangle);

    showPerimeter(triangle);
  }

  public static void showArea(Shape shape) {
    System.out.println(shape.getArea());
  }

  public static void showPerimeter(Perimeterable shape) {
    System.out.println(shape.getPerimeter());
  }
}
