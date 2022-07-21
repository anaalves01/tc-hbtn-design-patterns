public class VideoMediaPlayer implements AdvancedMediaPlayer {

    @Override
    public void reproduzirVlc(String arquivoVlc) {
        System.out.print("Reproduzindo VLC: " + arquivoVlc);
    }

    @Override
    public void reproduzirMp4(String arquivoMp4) {
        System.out.print("Reproduzindo MP4: " + arquivoMp4);
    }

}
