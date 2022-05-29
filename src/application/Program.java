///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

package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
