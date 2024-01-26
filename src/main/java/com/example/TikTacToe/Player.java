package com.example.TikTacToe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Player {
    public String playerName;
    public PlayingPiece playingPiece;
}
