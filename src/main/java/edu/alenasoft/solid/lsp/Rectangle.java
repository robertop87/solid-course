package edu.alenasoft.solid.lsp;

public class Rectangle extends Shape {

  private int height;
  private int width;

  /*
  public Rectangle(int height, int width) {
    this.height = height;
    this.width = width;
  }*/

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public int getArea() {
    return this.height * this.width;
  }
}

