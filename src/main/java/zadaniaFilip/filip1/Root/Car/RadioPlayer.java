package zadaniaFilip.filip1.Root.Car;


import zadaniaFilip.filip1.Root.music;

import java.util.ArrayList;

public class RadioPlayer {



    private int cena;
    private ArrayList<music> musicArrayList;




    public RadioPlayer(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public ArrayList<music> getMusicArrayList() {
        return musicArrayList;
    }

    public void setMusicArrayList(ArrayList<music> musicArrayList) {
        this.musicArrayList = musicArrayList;
    }

    void addToList(music musicArrayListIn){
        this.musicArrayList.add(musicArrayListIn);

    }


}

