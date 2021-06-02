package za.ac.cput.repository.demorgraphy;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Gender;
import za.ac.cput.entity.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;

import static org.junit.jupiter.api.Assertions.*;

class RaceRepositoryTest {
  private  static RaceRepository repository=new RaceRepository();
  private static  Race race= RaceFactory.createRace("Indiana");
    @Test
    void create() {
        Race created = repository.create(race);
        assertEquals(race.getId(), created.getId());
        System.out.println("Created" + created);
    }

    @Test
    void read() {
        Race read = repository.read(race.getId());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        Race updated = new Race.Builder().copy(race).setDesc("Indian").builder();
        System.out.println("Updated " + updated);
    }

    @Test
    void delete() {
        repository.delete(race.getId());
        System.out.println("Deleted " + race.getId() + " ");
    }
}