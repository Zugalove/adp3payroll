package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demorgraphy.Gender;

class GenderFactoryTest {
    @Test
         public void createGender(){
        Gender gender=GenderFactory.createGender("Male");
        System.out.println(gender);

        }

    }

