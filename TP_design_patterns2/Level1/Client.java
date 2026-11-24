public class Client{
    public static void main(String[] args){

        System.out.println("Level 1: Music Library Rescue");

        MusicPlayer legacy = new LegacyMusicPlayerAdapter();
        legacy.play("artist", "title");
        legacy.play("", "");


        MusicPlayer streaming = new StreamingPlayerAdapter();
        streaming.play("artist", "title");
        streaming.play("", "");

    }
}
