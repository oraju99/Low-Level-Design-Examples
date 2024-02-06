package com.example.BookMyShow;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Screen {
    int screenId;
    List<Seat> seats;
}
