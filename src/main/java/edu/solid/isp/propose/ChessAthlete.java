package edu.solid.isp.propose;

public class ChessAthlete implements Athlete, Chessable {



  public void play() {
    this.analyze();
  }

  public void analyze() {
    System.out.println("analyzing...");
  }
}
