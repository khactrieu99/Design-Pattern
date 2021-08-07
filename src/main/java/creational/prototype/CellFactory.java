package creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author trieutk
 */
public class CellFactory {
    private static final Map<String, Cell> CELL_CACHE = new HashMap<>();

    private CellFactory() {

    }

    public static Cell getCell(String color) {
        if(CELL_CACHE.containsKey(color)) {
            Cell cell = new Cell(color);
            CELL_CACHE.put(color, cell);
        }
        return CELL_CACHE.get(color).clone();
    }
}
