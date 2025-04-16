package main.java.com.pluralsight.FullNameGenerator;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine().trim();
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();
        System.out.print("Enter your suffix: ");
        String suffix = scanner.nextLine().trim();
        scanner.close();
        printFullName(firstName, middleName, lastName, suffix);
    }

    public static void printFullName(String firstName, String middleName, String lastName, String suffix) {
        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(firstName).append(" ");
        if (!middleName.isEmpty()) {
            fullNameBuilder.append(middleName).append(" ");
        }
        fullNameBuilder.append(lastName);
        if (!suffix.isEmpty()) {
            fullNameBuilder.append(", ").append(suffix);
        }
        System.out.println(fullNameBuilder);
    }
}