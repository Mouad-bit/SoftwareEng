package Level3;


public class OldRobotAdapter implements BattleUnit {
    private OldRobot oldRobot;

    public OldRobotAdapter(OldRobot oldRobot) {
        this.oldRobot = oldRobot;
    }

    @Override
    public void attack() {
        oldRobot.fireLaser();
    }

    @Override
    public int getPower() {
        return oldRobot.getLaserPower();
    }
}
