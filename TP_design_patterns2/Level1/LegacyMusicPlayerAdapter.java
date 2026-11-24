public class LegacyMusicPlayerAdapter implements MusicPlayer{
    private LegacyMusicPlayer legacyPlayer;

    //wrap the adptee 
    public LegacyMusicPlayerAdapter(){
        legacyPlayer = new LegacyMusicPlayer();
    }

    //implement the target
    public boolean play(String artist , String title){
        String track;
        track = artist.toUpperCase() + " - " + title.toUpperCase();

        if(legacyPlayer.playTrack(track) == 1){
            return true;
        }
        else{
            return false;
        }
    }

}