package edu.alenasoft.solid.lsp;

public class Triangle extends Shape implements Perimeterable {

  private int base;
  private int height;

  public void setBase(int base) {
    this.base = base;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  @Override
  public int getArea() {
    return this.base*this.height/2;
  }

  @Override
  public int getPerimeter() {
    return this.height*3;
  }
}
