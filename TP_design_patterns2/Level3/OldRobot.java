package Level3;

public class OldRobot {
    private final String model;
    private final int laserPower;

    public OldRobot(String model, int laserPower) {
        this.model = model;
        this.laserPower = laserPower;
    }

    public void fireLaser() {
        System.out.println(model + " fires a laser!");
    }

    public int getLaserPower() { return laserPower; }
}
