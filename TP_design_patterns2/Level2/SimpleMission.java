package Level2;

//Leaf
public class SimpleMission implements Mission {
    private String name;
    private int duration;

    public SimpleMission(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + name + " (" + duration + " min)");
    }

    @Override
    public int getDuration() {
        return duration;
    }
}

