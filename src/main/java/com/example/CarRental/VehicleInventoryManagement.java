package com.example.CarRental;

import com.example.CarRental.Vehicle.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class VehicleInventoryManagement {
    List<Vehicle> vehicles;

}
