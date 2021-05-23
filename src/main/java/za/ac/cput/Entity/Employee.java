package za.ac.cput.Entity;

public class Employee {
    private  String employeeNumber, firstName, lastname;

    private Employee(Builder builder) {
        this.employeeNumber= builder.employeeNumber;
        this.firstName= builder.firstName;
        this.lastname= builder.lastname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public  static class   Builder{
        private  String employeeNumber, firstName, lastname;

        public Builder setEmployeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;

            return  this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return  this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        public Employee build(){

            return new Employee(this);
        }

       public  Builder copy(Employee employee) {
            this.employeeNumber=employee.employeeNumber;
            this.firstName=employee.firstName;
            this.lastname=employee.lastname;

             return  this;
       }

    }

}
