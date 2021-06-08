package za.ac.cput.factory.user;

import za.ac.cput.entity.user.Employee;
import za.ac.cput.repository.Repository;


import java.util.List;

public class EmployeeRepository implements Repository<Employee, String > {
    private List<Employee> employeeDB;

    public EmployeeRepository(List<Employee> employeeDB) {
        this.employeeDB = employeeDB;
    }

    @Override
    public Employee create(Employee employee) {
        return null;
    }

    @Override
    public Employee read(String s) {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}



