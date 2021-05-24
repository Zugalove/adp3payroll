package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Employee;

class EmployeeFactoryTest {
    @Test
      public void   createEmployee(){
        Employee employee=EmployeeFactory.createEmployee("Will", "Smith");
        System.out.print(employee);
    }

}