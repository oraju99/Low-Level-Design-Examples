package com.example.SnakeAndLadder;

public class Board {
    Cell[][] cells;

    Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        generateSnakes(numberOfSnakes, boardSize);
        generateLadders(numberOfLadders, boardSize);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++) {
            for(int j=0;j<boardSize;j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    private void generateSnakes(int numberOfSnakes, int boardSize) {
        while (numberOfSnakes > 0) {
            int upperLimit = boardSize*boardSize;
            int snakeHead = (int)(Math.random()*upperLimit);
            int snakeTail = (int)(Math.random()*upperLimit);

            if (snakeTail >= snakeHead) {
                continue;
            }
            Jump snakeObject = new Jump();
            snakeObject.start = snakeHead;
            snakeObject.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObject;

            System.out.println("Snake generated, snake's head " + snakeHead + " snake's tail " + snakeTail);
            numberOfSnakes--;
        }
    }

    private void generateLadders(int numberOfLadders, int boardSize) {
        while (numberOfLadders > 0) {
            int upperLimit = boardSize*boardSize;
            int ladderStart = (int)(Math.random()*upperLimit);
            int ladderEnd = (int)(Math.random()*upperLimit);

            if (ladderEnd <= ladderStart) {
                continue;
            }
            Jump ladderObject = new Jump();
            ladderObject.start = ladderStart;
            ladderObject.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObject;

            System.out.println("Ladder generated, ladder's start " + ladderStart + " ladder's end " + ladderEnd);
            numberOfLadders--;
        }
    }
    

    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}
