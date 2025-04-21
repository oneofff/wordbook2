package com.pluralsight.CarInventory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    @Override
    public String toString() {
        String colorCode = getAnsiColorCode(color); // Maps the color name to an ANSI code
        return "\033[1;34mCar Details:\033[0m\n" +
                "\033[1;32mVehicle ID:\033[0m " + vehicleId + "\n" +
                "\033[1;32mMake & Model:\033[0m " + makeModel + "\n" +
                "\033[1;32mColor:\033[0m " + colorCode + color + "\033[0m\n" + // Colored name
                "\033[1;32mOdometer Reading:\033[0m " + odometerReading + " km\n" +
                "\033[1;32mPrice:\033[0m $" + price;
    }

    private String getAnsiColorCode(String colorName) {
        return switch (colorName.toLowerCase()) {
            case "red" -> "\033[0;31m";
            case "green" -> "\033[0;32m";
            case "yellow" -> "\033[0;33m";
            case "blue" -> "\033[0;34m";
            case "magenta" -> "\033[0;35m";
            case "cyan" -> "\033[0;36m";
            case "white" -> "\033[0;37m";
            case "black" -> "\033[0;30m";
            case "gray", "silver" -> "\033[1;30m"; // Bright black (gray)
            default -> ""; // No color fallback
        };
    }

}
