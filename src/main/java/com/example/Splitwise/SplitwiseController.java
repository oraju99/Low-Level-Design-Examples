package com.example.Splitwise;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class SplitwiseController {

    private final SplitwiseService splitwiseService;

    @PostMapping("/addUser")
    public void addUser(@RequestParam String userId, @RequestParam String name) {
        splitwiseService.addUser(userId, name);
    }

    @PostMapping("/addExpense")
    public void addExpense(@RequestParam String paidBy,
                           @RequestParam double amount,
                           @RequestBody List<String> participants) {
        splitwiseService.addExpense(paidBy, amount, participants);
    }

    @GetMapping("/balances/{userId}")
    public Map<String, Double> getUserBalance(@PathVariable String userId) {
        return splitwiseService.getBalance(userId);
    }

    @GetMapping("/balances")
    public void showAllBalances() {
        splitwiseService.showBalances();
    }
}
