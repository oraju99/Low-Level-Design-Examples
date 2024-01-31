package com.example.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playersList = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10, 5, 5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        Player player1 = new Player("p1", 1);
        Player player2 = new Player("p2", 1);
        playersList.add(player1);
        playersList.add(player2);
    }

    public void startGame() {
        while (winner == null) {
            // check the turn of the player
            Player playerTurn = playerTurn();
            System.out.println("Player turn is : " + playerTurn.id + " and the player position is : " + playerTurn.currentPosition);

            // roll the dice
            int diceNumber = dice.rollDice();

            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;

            System.out.println("Player turn is : " + playerTurn.id + " and the player new position is : " + playerTurn.currentPosition);

            // check for the win
            if (playerNewPosition >= board.cells.length*board.cells.length) {
                winner = playerTurn;
            }
        }
        System.out.println("Winner of the game is : " + winner.id);
    }

    // this function gives the end position of the player
    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition >= board.cells.length * board.cells.length) {
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder" : "snake";
            System.out.println("Jump done by " + jumpBy);
            return cell.jump.end;
        }
        return playerNewPosition;
    }

    private Player playerTurn() {
        Player player = playersList.removeFirst();
        playersList.addLast(player);
        return player;
    }
}
