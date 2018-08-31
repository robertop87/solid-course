package edu.solid.ocp.proposal;

public class Shape {

  Areable areable;

  public Shape(Areable areable) {
    this.areable = areable;
  }

  public void math() {
    System.out.println(this.areable.area());
  }
}
