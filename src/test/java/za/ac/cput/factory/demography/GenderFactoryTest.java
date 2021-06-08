package za.ac.cput.factory.demography;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

public class GenderFactoryTest {
    @Test
   public void createEmployee(String firstName, String lastName){
       Employee employee= EmployeeFactory.createEmployee("Zookz", "Zeelar");

       System.out.println(employee);

   }

}