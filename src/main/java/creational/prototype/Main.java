package creational.prototype;

/**
 * @author trieutk
 */
public class Main {
    public static void main(String[] args) {
        Cell cell;
        Cell[][] board = new Cell[8][8];

        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                if((i+j)%2==0) {
                    cell = CellFactory.getCell("WHITE");
                } else cell = CellFactory.getCell("BLACK");

                board[i][j] = cell;
            }
        }

    }
}
