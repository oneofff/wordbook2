package com.pluralsight.CellPhoneService.model;

import lombok.Data;

@Data
public class CellPhoneService {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhoneService() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public void printInfo() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);
    }
}
