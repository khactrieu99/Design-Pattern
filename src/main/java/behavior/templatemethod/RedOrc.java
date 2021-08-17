package behavior.templatemethod;

/**
 * @author trieutk
 */
public class RedOrc extends Orc {

    @Override
    protected void kill() {
        System.out.println("Make the them cry");
        super.kill();
    }

    @Override
    protected void collectCoin() {
        this.setTreasure(this.getTreasure() + 100);
        System.out.println("Added 100 coin to treasure");
    }

    @Override
    protected void useSuperPower() {
        System.out.println("Magic wand");
    }
}
