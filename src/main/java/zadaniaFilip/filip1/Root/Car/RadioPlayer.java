package zadaniaFilip.filip1.Root.Car;


import java.util.List;

public class RadioPlayer {
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Song> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Song> playList) {
        this.playList = playList;
    }

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

