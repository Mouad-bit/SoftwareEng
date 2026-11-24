package Level2;

public class Client {
    public static void main(String[] args) {
        System.out.println("Level 2: Mission Planner");

        MissionGroup preparation = new MissionGroup("Preparation");
        preparation.add(new SimpleMission("Check fuel", 5));
        preparation.add(new SimpleMission("Load robots", 10));

        MissionGroup launch = new MissionGroup("Launch Operation");
        launch.add(preparation);
        launch.add(new SimpleMission("Deploy", 8));

        launch.display("");
        System.out.println("Total duration: " + launch.getDuration() + " minutes"); 
    }
}
