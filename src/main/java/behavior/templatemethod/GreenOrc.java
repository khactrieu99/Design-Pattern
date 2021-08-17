package behavior.templatemethod;

/**
 * @author trieutk
 */
public class GreenOrc extends Orc {
    @Override
    protected void collectCoin() {
        this.setTreasure(this.getTreasure() + 10);
        System.out.println("Added 10 coin to treasure");
    }

    @Override
    protected void useSuperPower() {
        System.out.println("Strength + Axe");
    }
}
