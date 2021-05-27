package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.user.Employee;

class EmployeeFactoryTest {
    @Test
      public void   createEmployee(){
        Employee employee= EmployeeFactory.createEmployee("Zookz", "Zeehar");
        System.out.print(employee);
    }

}