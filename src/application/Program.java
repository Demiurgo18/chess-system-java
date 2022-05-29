///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

package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
