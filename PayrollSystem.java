import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Motor PH Payroll System ===");

        System.out.print("Enter Employee Number: ");
        int empNum = input.nextInt();
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hours = input.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        double rate = input.nextDouble();

        double grossSalary = hours * rate;

        double sss = grossSalary * 0.05;
        double philhealth = grossSalary * 0.03;
        double pagibig = grossSalary * 0.02;

        double deductions = sss + philhealth + pagibig;

        double netSalary = grossSalary - deductions;

        System.out.println("\n=== Payroll Summary ===");
        System.out.println("Employee #: " + empNum);
        System.out.println("Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Total Deductions: " + deductions);
        System.out.println("Net Salary: " + netSalary);
    }
}
