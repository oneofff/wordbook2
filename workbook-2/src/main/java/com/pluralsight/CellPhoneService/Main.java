package com.pluralsight.CellPhoneService;

import com.pluralsight.CellPhoneService.model.CellPhoneService;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhoneService cellPhoneService = new CellPhoneService();
        System.out.println("What is the serial number?");
        cellPhoneService.setSerialNumber(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character
        System.out.println("What is the model?");
        cellPhoneService.setModel(scanner.nextLine());
        System.out.println("What is the carrier?");
        cellPhoneService.setCarrier(scanner.nextLine());
        System.out.println("What is the phone number?");
        cellPhoneService.setPhoneNumber(scanner.nextLine());
        System.out.println("What is the owner?");
        cellPhoneService.setOwner(scanner.nextLine());
        cellPhoneService.printInfo();
    }
}
