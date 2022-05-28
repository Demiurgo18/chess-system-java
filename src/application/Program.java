///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

package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
