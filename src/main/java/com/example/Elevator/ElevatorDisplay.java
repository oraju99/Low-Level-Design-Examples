package com.example.Elevator;

public class ElevatorDisplay {
    int floor;
    Direction direction;

    void setDisplay(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    void showDisplay() {
        System.out.println(floor);
        System.out.println(direction);
    }
}
