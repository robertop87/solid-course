package edu.solid.isp.smell;

public class Athlete {

  public Athlete(String name) {
    this.name = name;
  }

  private String name;

  public void jump() {
    System.out.println("Jumping");
  }

  public void swim() {
    System.out.println("Swimming");
  }

  public void run() {
    System.out.println("Running");
  }

  public void sendRemoteMessage() {
    System.out.println("Sending remote message");
  }
}
