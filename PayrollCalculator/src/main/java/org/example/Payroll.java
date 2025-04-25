package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void findLoadAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the employee .csv file: ");
        String filePath = scanner.nextLine();

        loadEmployeesFromFile(filePath);
        printPayroll();
    }

    private void loadEmployeesFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            Pattern pattern = Pattern.compile("\\|");

            while ((line = reader.readLine()) != null) {
                String[] tokens = pattern.split(line);

                if (tokens.length == 4) {
                    int id = Integer.parseInt(tokens[0].trim());
                    String name = tokens[1].trim();
                    double hours = Double.parseDouble(tokens[2].trim());
                    double rate = Double.parseDouble(tokens[3].trim());

                    Employee emp = new Employee(id, name, hours, rate);
                    employees.add(emp);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private void printPayroll() {
        System.out.printf("%-5s %-20s %-10s%n", "ID", "Name", "Gross Pay");
        System.out.println("-----------------------------------------");

        for (Employee e : employees) {
            System.out.printf("%-5d %-20s $%.2f%n", e.getEmployeeID(), e.getName(), e.getGrossPay());
        }
    }
}