package com.example.Splitwise;

import lombok.Data;

import java.util.List;

@Data
public class Expense {
    private String paidBy;
    private double amount;
    private List<String> participants;
}
