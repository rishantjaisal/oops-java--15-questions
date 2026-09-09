package Java_OOPS_Program;

import java.io.*;
import java.util.Scanner;

class Employeee {
    private int empNo;
    private String empName;
    private int empBasic;

    Employeee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    int getEmpNo() {
        return empNo;
    }

    String getEmpName() {
        return empName;
    }

    int getEmpBasic() {
        return empBasic;
    }
}

public class WriteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee number: ");
            int empNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter employee name: ");
            String empName = sc.nextLine();

            System.out.print("Enter employee basic salary: ");
            int empBasic = sc.nextInt();

            Employeee emp = new Employeee(empNo, empName, empBasic);

            FileWriter writer = new FileWriter("emp.txt");

            writer.write(emp.getEmpNo() + "\n");
            writer.write(emp.getEmpName() + "\n");
            writer.write(emp.getEmpBasic() + "\n");

            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("emp.txt"));

            System.out.println("\nEmployee Details");
            System.out.println("Employee No = " + reader.readLine());
            System.out.println("Employee Name = " + reader.readLine());
            System.out.println("Employee Basic = " + reader.readLine());

            reader.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
