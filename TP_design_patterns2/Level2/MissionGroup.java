package Level2;


import java.util.ArrayList;
import java.util.List;

//Composite
public class MissionGroup implements Mission {
    private String name;
    private List<Mission> children = new ArrayList<>();

    public MissionGroup(String name){
        this.name = name;
    }

    public void add(Mission m){ 
        children.add(m); 
    }

    public void remove(Mission m){ 
        children.remove(m); 
    }

    @Override
    public void display(String indent){
        System.out.println(indent + name + " [total " + getDuration() + " min]");
        for (Mission m : children) {
            m.display(indent + "  ");
        }
    }

    @Override
    public int getDuration(){
        int total = 0;
        for (Mission m : children) {
            total += m.getDuration();
        }
        return total;
    }
}
