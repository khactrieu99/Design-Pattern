package structural.flyweight;

/**
 * @author trieutk
 */
public class Family {
    private String name;
    private String address;
    private int members;
    private long asset;

    public Family(String name, String address, int members, long asset) {
        this.name = name;
        this.address = address;
        this.members = members;
        this.asset = asset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public long getAsset() {
        return asset;
    }

    public void setAsset(long asset) {
        this.asset = asset;
    }
}
