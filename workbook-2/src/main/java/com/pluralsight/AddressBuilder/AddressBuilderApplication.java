package main.java.com.pluralsight.AddressBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddressBuilderApplication {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        String fullName = scanner.nextLine().trim();

        System.out.println();

        System.out.println("Billing Street:");
        String billingStreet = scanner.nextLine().trim();
        System.out.println("Billing City:");
        String billingCity = scanner.nextLine().trim();
        System.out.println("Billing State:");
        String billingState = scanner.nextLine().trim();
        System.out.println("Billing Zip:");
        String billingZip = scanner.nextLine().trim();

        System.out.println();

        System.out.println("Shipping Street:");
        String shippingStreet = scanner.nextLine().trim();
        System.out.println("Shipping City:");
        String shippingCity = scanner.nextLine().trim();
        System.out.println("Shipping State:");
        String shippingState = scanner.nextLine().trim();
        System.out.println("Shipping Zip:");
        String shippingZip = scanner.nextLine().trim();

        scanner.close();

        StringBuilder addressBuilder = new StringBuilder();
        addressBuilder.append(fullName).append("\n\n");
        addressBuilder.append("Billing Address:\n");
        addressBuilder.append(billingStreet).append("\n");
        addressBuilder.append(billingCity).append(", ").append(billingState)
                .append(" ").append(billingZip).append("\n\n");
        addressBuilder.append("Shipping Address:\n");
        addressBuilder.append(shippingStreet).append("\n");
        addressBuilder.append(shippingCity).append(", ").append(shippingState).append(" ")
                .append(shippingZip).append("\n");

        System.out.println(addressBuilder);
    }
}
