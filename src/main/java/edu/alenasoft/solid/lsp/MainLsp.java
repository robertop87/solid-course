package edu.alenasoft.solid.lsp;

public class MainLsp {

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.setHeight(2);
    rectangle.setWidth(5);

    Square square = new Square();
    square.setWidth(5);
    square.setHeight(10);

    showArea(rectangle);
    showArea(square);
  }

  public static void showArea(Rectangle rectangle) {
    System.out.println(rectangle.getArea());
  }
}
