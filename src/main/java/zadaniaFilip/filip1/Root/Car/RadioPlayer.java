package zadaniaFilip.filip1.Root.Car;


import java.util.List;

public class RadioPlayer {

    private int price;
    List<Song> playList;

    public RadioPlayer(int price, List<Song> playList) {
        this.price = price;
        this.playList = playList;
    }

    public void addSongToPlaylist (Song song){
        this.playList.add(song);

}



}

