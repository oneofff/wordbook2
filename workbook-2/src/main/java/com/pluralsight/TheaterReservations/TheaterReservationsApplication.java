package main.java.com.pluralsight.TheaterReservations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine().trim();
        System.out.println("Enter the date of the show (MM/DD/YYYY): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(scanner.nextLine().trim(), formatter);
        System.out.println("Enter the number of tickets you will need: ");
        int numberOfTickets = scanner.nextInt();
        scanner.close();

        printReservationDetails(fullName, showDate, numberOfTickets);
    }

    private static void printReservationDetails(String fullName, LocalDate showDate, int numberOfTickets) {
        System.out.println(numberOfTickets + " ticket" + (numberOfTickets > 1 ? "s" : "") + " reserved for " +
                showDate.format(DateTimeFormatter.ofPattern("MMM dd yyyy")) + " under " + fullName);
    }
}
