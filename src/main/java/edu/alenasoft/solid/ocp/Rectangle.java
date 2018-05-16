package edu.alenasoft.solid.ocp;

public class Rectangle implements Shape {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int getArea() {
    return this.width * this.height;
  }

  @Override
  public int getPerimeter() {
    return 100;
  }

  @Override
  public int getTang() {
    return 0;
  }
}
