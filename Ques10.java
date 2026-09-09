package Java_OOPS_Program;

class Employee {
    double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    double calculateSalary() {
        return 80000;
    }
}

class Programmer extends Employee {
    double calculateSalary() {
        return 60000;
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee;

        employee = new Manager();
        System.out.println("Manager Salary = " + employee.calculateSalary());

        employee = new Programmer();
        System.out.println("Programmer Salary = " + employee.calculateSalary());
    }
}
