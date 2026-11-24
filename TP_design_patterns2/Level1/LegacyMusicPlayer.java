public class LegacyMusicPlayer {

    public int playTrack ( String track ) {
        if ( track == null || track.trim().isEmpty () ) {
        return 0;
        }

        System.out.println ("[ LEGACY PLAYER ] " + track ) ;
        return 1;
    }
}