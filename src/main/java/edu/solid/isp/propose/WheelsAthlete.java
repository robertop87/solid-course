package edu.solid.isp.propose;

public class WheelsAthlete implements Athlete, Runnable {

  public void run() {
    System.out.println("Run with the wheels");
  }

  public void play() {
    this.run();
  }
}
