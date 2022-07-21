import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.reproduzir(TipoMedia.MP3, "The Weeknd - Blinding Lights.mp3");

        System.out.println();

        VideoMediaPlayer videoMediaPlayer = new VideoMediaPlayer();
        videoMediaPlayer.reproduzirMp4("Uncharted.mp4");

        System.out.println();

        audioPlayer.reproduzir(TipoMedia.VLC, "Moon Knight S01E01.vlc");
    }
}
