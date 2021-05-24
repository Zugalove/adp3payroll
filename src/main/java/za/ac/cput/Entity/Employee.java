/* Employee.java
   Entity for the Employee
   Author:Mandisa Elizabeth Msongelwa (217149073)
   Date: 24 May 2021
 */
package za.ac.cput.Entity;

public class Employee {
    private String employeeNumber, firstName, lastName;

    private Employee(Builder builder) {
        this.employeeNumber = builder.employeeNumber;
        this.firstName = builder.firstName;;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder {
        private String employeeNumber, firstName, lastName;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Employee employee) {
            this.employeeNumber = employee.employeeNumber;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            return this;
        }

        public Employee build() {

            return new Employee(this);
        }
    }
}
