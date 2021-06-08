package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

class EmployeeFactoryTest {
    @Test
      public void   createEmployee(){
        Employee employee= EmployeeFactory.createEmployee("Zookz", "Zeehar");
                Assert.assertEquals(String.valueOf(employee), employee.getFirstName()
                        ,employee.getFirstName());


    }

}