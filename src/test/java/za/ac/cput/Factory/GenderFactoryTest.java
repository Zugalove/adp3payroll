package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Gender;

class GenderFactoryTest {
    @Test
         public void createGender(){
        Gender gender=GenderFactory.createGender("Male");
        System.out.println(gender);

        }

    }

