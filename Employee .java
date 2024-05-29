class Employee {
  
    private String name;
    private int employeeId;
    private String department;
    private double salary;

      public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

      public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

    public static void main(String[] args) {
                Employee emp1 = new Employee("John Doe", 1001, "IT", 50000.00);
        Employee emp2 = new Employee("Jane Smith", 1002, "HR", 60000.00);

        
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();
        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.displayDetails();
    }
}
