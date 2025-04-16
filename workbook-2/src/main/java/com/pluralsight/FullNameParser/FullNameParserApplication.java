package main.java.com.pluralsight.FullNameParser;

import java.util.Scanner;

public class FullNameParserApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name (first last or first middle last): ");
        String fullName = scanner.nextLine().trim();
        String[] nameParts = fullName.split(" ");

        switch (nameParts.length) {
            case 3:
                printFullName(nameParts[0], nameParts[1], nameParts[2]);
                break;
            case 2:
                printFullName(nameParts[0], "", nameParts[1]);
                break;
            default:
                System.out.println("Invalid input. Please enter your name in the correct format.");
        }
        scanner.close();

    }

    public static void printFullName(String firstName, String middleName, String lastName) {
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
