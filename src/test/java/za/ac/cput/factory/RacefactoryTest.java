package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;

class RacefactoryTest {
@Test
public void createRace(){
    Race race= RaceFactory.createRace("Black");
    System.out.print(race);
}
}