package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demorgraphy.Race;

class RacefactoryTest {
@Test
public void createRace(){
    Race race= RaceFactory.createRace("Black");
    System.out.print(race);
}
}