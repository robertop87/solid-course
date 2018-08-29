package edu.solid.lsp.proposal;

public class Circle implements Shape {

  public Circle(int radio) {
    this.radio = radio;
  }

  private int radio ;

  public int getRadio() {
    return radio;
  }

  public void setRadio(int radio) {
    this.radio = radio;
  }

  @Override
  public double area() {
    return radio* radio *Math.PI;
  }
}
