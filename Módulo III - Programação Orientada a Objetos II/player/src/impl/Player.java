package impl;

import midias.Musica;
import midias.Podcast;
import midias.Video;

public class Player {

    PlayListMusic playlist = new PlayListMusic("Favoritas", "Rock");

    Musica musica = new Musica();
    Video video = new Video();
    Podcast podcast = new Podcast();

    public Player () {
        playlist.add(musica);
    }
}
