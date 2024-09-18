package hnt.coding.interview.design.structure.adapter;

public class Application {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");    // Built-in support for MP3
        audioPlayer.play("mp4", "video.mp4");   // Adapter handles MP4
        audioPlayer.play("vlc", "movie.vlc");   // Adapter handles VLC
        audioPlayer.play("avi", "movie.avi");   // Unsupported format
    }
}
