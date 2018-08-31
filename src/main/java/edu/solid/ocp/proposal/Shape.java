package edu.solid.ocp.proposal;

public class Shape {

  Areable areable;

  public Shape(Areable areable) {
    this.areable = areable;
  }

  public void printArea() {
    System.out.println(this.areable.area());
  }
}
