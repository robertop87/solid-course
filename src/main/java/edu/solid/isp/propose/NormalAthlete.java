package edu.solid.isp.propose;

public class NormalAthlete implements OlimpicAthlete {

  public void run() {
    System.out.println("Run with my legs");
  }

  public void swim() {
    System.out.println("Butterfly swim style");
  }

  public void play() {
    this.run();
    this.swim();
  }
}
