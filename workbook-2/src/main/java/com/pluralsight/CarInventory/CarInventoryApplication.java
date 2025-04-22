package com.pluralsight.CarInventory;

import java.util.Scanner;

public class CarInventoryApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise2();
        exercise1();
    }

    private static void exercise1() {
        Car[] carArray = createArrayOfCars();

        while (true) {
            displayMenu();
            int command = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (command) {
                case 1:
                    listAllVehicles(carArray);
                    break;
                case 2:
                    searchByMakeModel(carArray);
                    break;
                case 3:
                    searchByPriceRange(carArray);
                    break;
                case 4:
                    searchByColor(carArray);
                    break;
                case 5:
                    carArray = addVehicle(carArray);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static Car[] createArrayOfCars() {
        return new Car[]{
                new Car(101121, "Ford Explorer", "Red", 45000, 13500),
                new Car(101122, "Toyota Camry", "Blue", 60000, 11000),
                new Car(101123, "Chevrolet Malibu", "Black", 50000, 9700),
                new Car(101124, "Honda Civic", "White", 70000, 7500),
                new Car(101125, "Subaru Outback", "Green", 55000, 14500),
                new Car(101126, "Jeep Wrangler", "Yellow", 30000, 16000)
        };
    }

    private static void exercise2() {
        Car mazda = Car.builder()
                .vehicleId(1)
                .makeModel("Mazda 3")
                .color("Red")
                .odometerReading(10000)
                .price(20000.0f)
                .build();
        Car honda = Car.builder()
                .vehicleId(2)
                .makeModel("Honda Accord")
                .color("Blue")
                .odometerReading(20000)
                .price(25000.0f)
                .build();
        Car toyota = Car.builder()
                .vehicleId(3)
                .makeModel("Toyota Camry")
                .color("Black")
                .odometerReading(30000)
                .price(30000.0f)
                .build();
        System.out.println(mazda + "\n");
        System.out.println(honda + "\n");
        System.out.println(toyota + "\n");
    }

    private static void displayMenu() {
        System.out.println("Welcome to the Car Inventory System!");
        System.out.println("What do you want to do?");
        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit");
        System.out.print("Enter your command: ");
    }

    private static Car[] addVehicle(Car[] carArray) {
        System.out.print("Enter vehicle ID: ");
        long vehicleId = scanner.nextLong();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter make/model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Enter odometer reading: ");
        int odometerReading = scanner.nextInt();
        System.out.print("Enter price: ");
        float price = scanner.nextFloat();

        Car newCar = new Car(vehicleId, makeModel, color, odometerReading, price);
        System.out.println("Vehicle added: " + newCar);
        // Add the new car to the array copy array
        Car[] newCarArray = new Car[carArray.length + 1];
        System.arraycopy(carArray, 0, newCarArray, 0, carArray.length);
        newCarArray[carArray.length] = newCar;
        return newCarArray;
    }

    private static void searchByColor(Car[] carArray) {
        System.out.print("Enter the color to search for: ");
        String color = scanner.nextLine();
        boolean found = false;
        for (Car car : carArray) {
            if (car.getColor().equalsIgnoreCase(color)) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found with that color.");
        }
    }

    private static void searchByPriceRange(Car[] carArray) {
        System.out.print("Enter the minimum price: ");
        float minPrice = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter the maximum price: ");
        float maxPrice = scanner.nextFloat();
        scanner.nextLine();
        boolean found = false;
        for (Car car : carArray) {
            if (car.getPrice() >= minPrice && car.getPrice() <= maxPrice) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found in that price range.");
        }
    }

    private static void searchByMakeModel(Car[] carArray) {
        System.out.print("Enter the make/model to search for: ");
        String makeModel = scanner.nextLine();
        boolean found = false;
        for (Car car : carArray) {
            if (car.getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No vehicles found with that make/model.");
        }
    }

    private static void listAllVehicles(Car[] carArray) {
        System.out.println("Listing all vehicles:");
        for (Car car : carArray) {
            System.out.println(car);
            System.out.println("------------------------------");
        }
    }
}
