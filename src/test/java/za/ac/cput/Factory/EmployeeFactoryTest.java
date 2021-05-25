package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Employee;

class EmployeeFactoryTest {
    @Test
      public void   createEmployee(){
        Employee employee=EmployeeFactory.createEmployee("Zookz", "Zeehar");
        System.out.print(employee);
    }

}