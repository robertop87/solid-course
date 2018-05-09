package edu.alenasoft.solid.lsp;

public class Square extends Shape {

  private int size;

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public int getArea() {
    return this.size*this.size;
  }
}
