package edu.alenasoft.solid.isp;

import java.util.ArrayList;
import java.util.List;

public class ClientMain {

  public static void main(String[] args) {
    List<Athlete> athletes = new ArrayList<Athlete>();
    Athlete normal = new NormalAthlete();
    athletes.add(normal);
    // Run Normal Athletes
    athletes.forEach(a -> { a.run(); a.jump(); });

    List<SpecialAthlete> specialAthletes = new ArrayList<SpecialAthlete>();
    SpecialAthlete wheel = new WheelAthlete();
    specialAthletes.add(wheel);
    specialAthletes.add(new PistoriusAthlete());
    // Run Special Athletes
    specialAthletes.forEach(s -> s.run());
  }

}
