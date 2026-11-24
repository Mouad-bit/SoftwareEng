package Level3;
public class ModernRobot implements BattleUnit {
    String name;
    int power;

    @Override 
    public void attack(){
        System.out.println("Attack message");
    }

    @Override
    public int getPower(){
        return power;
    }
}
