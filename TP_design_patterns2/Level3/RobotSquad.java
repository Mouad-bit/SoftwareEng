package Level3;

import java.util.ArrayList;
import java.util.List;


public class RobotSquad implements BattleUnit {
    private String name;
    private List<BattleUnit> children = new ArrayList<>();

    public RobotSquad(String name) {
        this.name = name;
    }

    public void add(BattleUnit unit) {
        children.add(unit);
    }

    public void remove(BattleUnit unit) {
        children.remove(unit);
    }

    @Override
    public void attack() {
        System.out.println("Squad " + name + " attacks");
        for (BattleUnit u : children) {
            u.attack();
        }
    }

    @Override
    public int getPower() {
        int total = 0;
        for (BattleUnit u : children) {
            total += u.getPower();
        }
        return total; 
    }

}

