package com.github.zia;
public interface MediaPlayer {
    void play(String filename);
}
class VlcPlayer {
    public void playVlcFile(String filename) {
        System.out.println("Playing VLC file: " + filename);
    }
}
class VlcAdapter implements MediaPlayer {
    private final VlcPlayer vlcPlayer;
    public VlcAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }
    @Override
    public void play(String filename) {
        vlcPlayer.playVlcFile(filename);
    }
}
class Media {
    public static void main(String[] args) {
        MediaPlayer standardPlayer = filename -> System.out.println("Playing MP3 file: " + filename);
        standardPlayer.play("song.mp3");
        VlcPlayer legacyVlcPlayer = new VlcPlayer();
        MediaPlayer adaptedPlayer = new VlcAdapter(legacyVlcPlayer);
        adaptedPlayer.play("movie.vlc");
    }
}
