package behavior.memento;

/**
 * @author trieutk
 */
public class Move {
    private Chess chess;
    private Direction direction;

    public Move(Chess chess, Direction direction) {
        this.chess = chess;
        this.direction = direction;
    }

    public Chess getChess() {
        return chess;
    }

    public void setChess(Chess chess) {
        this.chess = chess;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
