package za.ac.cput.Factory;

import za.ac.cput.Entity.Employee;
import za.ac.cput.Util.GenericHelper;

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
