package edu.solid.ocp.proposal;

public class CircleAreaBehavior implements Areable {

  public CircleAreaBehavior(int radio) {
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
