package za.ac.cput.service;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;
import za.ac.cput.repository.demorgraphy.RaceRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
@FixMethodOrder(MethodSorters.JVM)
class RaceServiceImplTest {
    private  static RaceRepository repository=new RaceRepository();
    private static Race race= RaceFactory.createRace("Americana");

    @Test
    void create() {
        Race created = repository.create(race);
        assertEquals(race.getId(), created.getId());
        System.out.println("Created" + created);

    }

    @Test
    void read() {
         Race read= repository.read(race.getId());
          System.out.println("Read"+read);

    }

    @Test
    void update() {
        Race updated = new Race.Builder().copy(race).setDesc("American").builder();
        System.out.println("Updated " + updated);

    }

    @Test
    void delete() {
        repository.delete(race.getId());
        System.out.println("Deleted " + race.getId() + " ");

    }
}