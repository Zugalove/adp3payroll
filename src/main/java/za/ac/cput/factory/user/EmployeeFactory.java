package za.ac.cput.factory.user;

import za.ac.cput.entity.user.Employee;
import za.ac.cput.util.GenericHelper;

public class EmployeeFactory {
    public static Employee  createEmployee(String firstName, String lastName){
        String employeeId= GenericHelper.generateId();
        Employee employee=new Employee.Builder()
                .setEmployeeNumber(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
        return employee;
    }


}
