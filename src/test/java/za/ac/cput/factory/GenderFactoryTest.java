package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.demography.Gender;
import za.ac.cput.factory.demography.GenderFactory;

class GenderFactoryTest {
    @Test
         public void createGender(){
        Gender gender= GenderFactory.createGender("Male");
        System.out.println(gender);

        }

    }

