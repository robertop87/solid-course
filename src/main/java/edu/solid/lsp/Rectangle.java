package edu.solid.lsp;

public class Rectangle {
  private int height;
  private int width;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public double area() {
    return this.height * this.width;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "height=" + height +
        ", width=" + width +
        '}';
  }
}
