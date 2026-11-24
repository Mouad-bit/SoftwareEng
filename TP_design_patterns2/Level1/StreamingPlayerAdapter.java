public class StreamingPlayerAdapter implements MusicPlayer{
    StreamingPlayer streamPlayer ;

    public StreamingPlayerAdapter(){
        streamPlayer = new StreamingPlayer();
    }

    public boolean play(String artist , String title){
        Track track = new Track(artist, title);
        return streamPlayer.stream(track);
    }
}
