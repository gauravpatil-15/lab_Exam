class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class employee extends Person {
    private int employeeId;
    private String jobTitle;

    public employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

public class Employee {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person: " + person.getFirstName() + " " + person.getLastName());

        employee employee = new employee("Jane", "Smith", 12345, "Manager");
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}