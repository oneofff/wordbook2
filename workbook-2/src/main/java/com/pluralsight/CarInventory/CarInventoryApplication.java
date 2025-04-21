package com.pluralsight.CarInventory;

public class CarInventoryApplication {
    public static void main(String[] args) {
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
}
