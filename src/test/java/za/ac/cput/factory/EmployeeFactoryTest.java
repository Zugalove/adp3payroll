package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class EmployeeFactoryTest {
    Employee employee1;
    Employee employee2;
    Employee employee3;


    @Test
    public void createEmployee() {
        employee1 = EmployeeFactory.createEmployee("Zookz", "Zookel");
        employee2 = employee1;
        employee3 = EmployeeFactory.createEmployee("Zookz", "Zookel");

        System.out.println(" " + employee1);
        System.out.println(" " + employee2);
        System.out.println(" " + employee3);

        Assert.assertSame("Passed", employee1, employee2);

        Assert.assertEquals("Passed", employee1, employee2);

        Assert.assertNotEquals("Passed", employee1, employee3);


        assertTimeout(Duration.ofSeconds(5), () -> delaySecond()); // pass
    }

    @Test
    void delaySecond() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}




