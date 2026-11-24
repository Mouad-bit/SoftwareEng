public class StreamingPlayer {
    public boolean stream(Track track){
        if(track.artist == null || track.title == null){
            return false;
        }

        System.out.println("[Streaming Player] " + track.artist.toUpperCase() + " - "+ track.title.toUpperCase());
        return true;
    }
}
