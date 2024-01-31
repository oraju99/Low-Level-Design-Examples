package com.example.CarRental.Vehicle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    int vehicleId;
    int vehicleNumber;
    String companyName;
    int kmDriven;
    int manufactureYear;
    int average;
    int engineCapacity;
    int dailyRentalCost;
    int hourlyRentalCost;
    int noOfSeat;
    Status status;
    VehicleType vehicleType;
}
