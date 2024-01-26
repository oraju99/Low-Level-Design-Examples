package com.example.TikTacToe;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if (board[row][col] == null) {
            board[row][col] = playingPiece;
            return true;
        } else {
            return false;
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> pairList = new ArrayList<>();

        for (int i=0;i<size;i++) {
            for (int j=0;j<size;j++) {
                if( board[i][j] == null ) {
                    Pair<Integer, Integer> pair = new Pair<>(i, j);
                    pairList.add(pair);
                }
            }
        }

        return pairList;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

}