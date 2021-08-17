package behavior.templatemethod;

/**
 * @author trieutk
 */
public abstract class Orc {
    private int treasure;
    private int healthPoint;

    protected int getTreasure() {
        return treasure;
    }

    protected void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    protected int getHealthPoint() {
        return healthPoint;
    }

    protected void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    protected abstract void collectCoin();
    protected abstract void useSuperPower();

    protected void kill() {
        System.out.println("Kill the enemies");
    }

    final public void run() {
        useSuperPower();
        kill();
        collectCoin();
    }
}
