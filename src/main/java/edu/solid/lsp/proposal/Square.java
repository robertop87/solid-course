package edu.solid.lsp.proposal;

public class Square implements Shape {

  private int size;

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public double area() {
    return this.size*this.size;
  }
}
