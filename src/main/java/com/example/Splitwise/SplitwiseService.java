package com.example.Splitwise;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SplitwiseService {
    private Map<String, User> users = new HashMap<>();
    private Map<String, Map<String, Double>> balances = new HashMap<>(); // how much I need to give to someone

    public void addUser(String userId, String userName) {
        User user = new User(userId, userName);
        users.put(userId, user);
        balances.put(userId, new HashMap<>());
    }

    public void addExpense(String paidByUserId, Double amount, List<String> participants) {
        int totalParticipants = participants.size();
        double splitAmount = amount/ totalParticipants;
        for (String participant:participants) {
            if (!participant.equalsIgnoreCase(paidByUserId)) {
                balances.get(participant).put(paidByUserId, balances.get(participant).getOrDefault(paidByUserId, 0.0) - splitAmount);
                balances.get(paidByUserId).put(participant, balances.get(paidByUserId).getOrDefault(participant, 0.0) + splitAmount);
            }
        }
    }

    public Map<String, Double> getBalance(String userId) {
        return balances.get(userId);
    }

    public void showBalances() {
        for (String userId:balances.keySet()) {
            for (String owesTo:balances.get(userId).keySet()) {
                double amount = balances.get(userId).get(owesTo);
                if (amount>0) {
                    System.out.println(users.get(userId).getUserName() + " owes " + users.get(owesTo).getUserName() + ": " + amount);
                }
            }
        }
    }
}
