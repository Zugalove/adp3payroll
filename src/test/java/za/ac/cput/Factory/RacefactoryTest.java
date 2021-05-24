package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Race;

class RacefactoryTest {
@Test
public void createRace(){
    Race race=Racefactory.createRace("Black");
    System.out.print(race);
}
}