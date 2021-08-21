package behavior.chainofresponsibility;

/**
 * @author trieutk
 */
public enum Level {
    INFO(0), WARNING(1), ERROR(2);

    private int level;
    Level(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
