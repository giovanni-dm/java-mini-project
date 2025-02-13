package day24miniproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("Enter employee type (1: Full-Time, 2: Part-Time, 3: Manager, 4: Intern, 5: Contract, 0: Exit):");
            int employeeType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (employeeType == 0) {
                break;
            }

            System.out.println("Enter employee name:");
            String name = scanner.nextLine();

            System.out.println("Enter employee ID:");
            Long id = scanner.nextLong();

            try {
                switch (employeeType) {
                    case 1:
                        System.out.println("Enter base salary:");
                        double baseSalary = scanner.nextDouble();
                        System.out.println("Enter bonus:");
                        double bonus = scanner.nextDouble();
                        System.out.println("Enter benefits:");
                        double benefits = scanner.nextDouble();
                        employees.add(new FullTimeEmployee(id, name, baseSalary, bonus, benefits));
                        break;
                    case 2:
                        System.out.println("Enter hourly rate:");
                        double hourlyRate = scanner.nextDouble();
                        System.out.println("Enter hours worked:");
                        int hoursWorked = scanner.nextInt();
                        employees.add(new PartTimeEmployee(id, name, hourlyRate, hoursWorked));
                        break;
                    case 3:
                        System.out.println("Enter base salary:");
                        double managerBaseSalary = scanner.nextDouble();
                        System.out.println("Enter bonus:");
                        double managerBonus = scanner.nextDouble();
                        System.out.println("Enter benefits:");
                        double managerBenefits = scanner.nextDouble();
                        employees.add(new Manager(id, name, managerBaseSalary, managerBonus, managerBenefits));
                        break;
                    case 4:
                        System.out.println("Enter stipend:");
                        double stipend = scanner.nextDouble();
                        employees.add(new Intern(id, name, stipend));
                        break;
                    case 5:
                        System.out.println("Enter contract rate:");
                        double contractRate = scanner.nextDouble();
                        System.out.println("Enter contract length:");
                        int contractLength = scanner.nextInt();
                        employees.add(new Contractor(id, name, contractRate, contractLength));
                        break;
                    default:
                        System.out.println("Invalid employee type!");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\nEmployee Details and Salaries:");
        for (Employee employee : employees) {
            System.out.println(employee);
            System.out.println("Calculated Salary: " + employee.calculateSalary());
            System.out.println();
        }

        scanner.close();









    }
}
