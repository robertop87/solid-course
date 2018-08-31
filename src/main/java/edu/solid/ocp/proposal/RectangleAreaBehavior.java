package edu.solid.ocp.proposal;

public class RectangleAreaBehavior implements Areable {

  private int heigth;
  private int width;

  public RectangleAreaBehavior(int heigth, int width) {
    this.heigth = heigth;
    this.width = width;
  }

  @Override
  public double area() {
    return this.heigth * this.width;
  }
}
