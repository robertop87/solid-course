package edu.solid.isp.propose;

public class Main {

  public static void main(String[] args) {
    Athlete normalAthlete = new NormalAthlete();
    Athlete wheelsAthlete = new WheelsAthlete();
    Athlete chessAthlete = new ChessAthlete();

    normalAthlete.play();
    wheelsAthlete.play();
    chessAthlete.play();
  }
}
