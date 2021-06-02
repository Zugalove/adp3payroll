package za.ac.cput.repository.demorgraphy;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.demography.Gender;
import za.ac.cput.factory.demography.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.JVM)
public class GenderRepositoryTest {
    private static GenderRepository repository = new GenderRepository();
    private  static Gender gender = GenderFactory.createGender("Malie");

    @Test
    public void create() {
        Gender created = repository.create(gender);
        assertEquals(gender.getId(), created.getId());
        System.out.println("Created" + created);
    }

    @Test
    public void update() {
        Gender updated = new Gender.Builder().copy(gender).setDesc("Male").build();
        System.out.println("Updated " + updated);

    }

    @Test
    public void read() {
        Gender read = repository.read(gender.getId());
        System.out.println("Read " + read);
    }


    @Test
    public void delete() {
        repository.delete(gender.getId());
        System.out.println("Deleted " + gender.getId() + " ");
    }


}