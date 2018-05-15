package edu.alenasoft.solid.ocp;

public class Circle implements Shape {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public int getArea() {
    return 2*(22/7)*this.radius*this.radius;
  }
}
