package behavior.memento;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.printBoard();
        System.err.println();

        chessBoard.move(chessBoard.getChess(0, 0), Direction.RIGHT);
        chessBoard.printBoard();
        System.err.println();

        chessBoard.move(chessBoard.getChess(1, 1), Direction.DOWN);
        chessBoard.printBoard();
        System.err.println();

        chessBoard.undo();
        chessBoard.printBoard();
        System.err.println();
    }
}
