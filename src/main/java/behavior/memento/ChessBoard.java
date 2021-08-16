package behavior.memento;

/**
 * @author trieutk
 */
public class ChessBoard {
    private Chess[][] board = new Chess[8][8];
    private CareTaker careTaker = new CareTaker();

    public void printBoard() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(board[i][j]!=null) System.err.print(1);
                else System.err.print(0);
                System.err.print(" ");
            }
            System.err.println();
        }
    }

    public ChessBoard() {
        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if(i==0 || i==1 || i==6 || i==7) {
                    board[i][j]=new Chess();
                } else board[i][j]=null;
            }
        }
    }

    public Chess getChess(int y, int x) {
        return board[y][x];
    }

    public void move(Chess chess, Direction direction) {
        if(chess != null) {
            Chess newChess = new Chess();

            switch (direction) {
                case UP:
                    newChess.setY(chess.getY()-1);
                    newChess.setX(chess.getX());
                    break;
                case DOWN:
                    newChess.setY(chess.getY()+1);
                    newChess.setX(chess.getX());
                    break;
                case LEFT:
                    newChess.setY(chess.getY());
                    newChess.setX(chess.getX()-1);
                    break;
                case RIGHT:
                    newChess.setY(chess.getY());
                    newChess.setX(chess.getX()+1);
                default:
                    return;
            }

            if(board[newChess.getY()][newChess.getX()] == null) {
                careTaker.addNew(new Move(chess, direction));
                board[newChess.getY()][newChess.getX()] = newChess;
                board[chess.getY()][chess.getX()] = null;

                System.out.println("MOVE: board[" + chess.getY() + "][" + chess.getX() + "]->" + direction.name());
            } else {
                System.out.println("Cell not empty");
            }
        } else {
            System.out.println("Invalid coordinate");
        }
    }

    public void undo() {
        Move move = careTaker.getLast();

        if(move != null) {
            Chess chess = move.getChess();
            Direction direction = move.getDirection();

            System.out.println("UNDO: board[" + chess.getY() + "][" + chess.getX() + "]->" + direction.name());

            board[chess.getY()][chess.getX()] = null;

            switch (direction) {
                case RIGHT:
                    chess.setX(chess.getX() - 1);
                    break;
                case LEFT:
                    chess.setX(chess.getX() + 1);
                    break;
                case DOWN:
                    chess.setY(chess.getY() - 1);
                    break;
                case UP:
                    chess.setY(chess.getY() + 1);
                    break;
                default:
                    return;
            }

            board[chess.getY()][chess.getX()] = chess;
        }
    }
}
