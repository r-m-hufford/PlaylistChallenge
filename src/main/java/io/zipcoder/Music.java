package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int steps = 0;

        for (int i = startIndex; i < this.playList.length - 1; i++) {
            steps++;
            if (this.playList[i] == selection) {
                break;
            }
        }
        if (steps > (this.playList.length / 2)) {
            steps = playList.length - steps;
        }
        return steps;
    }

    public int setNextSong(String currentSong) {
        int nextSong = 0;

        for (int i = 0; i < this.playList.length - 1; i++) {
            if (this.playList[i] == currentSong) {
                nextSong = i + 1;
            }
        }
        return nextSong;
    }

    public int setLastSong(String currentSong) {
        int lastSong = 0;

        for (int i = 0; i < this.playList.length - 1; i++) {
            if (this.playList[i] == currentSong) {
                lastSong = i - 1;
            }
        }
        return lastSong;
    }

    public void setSong() {

    }
}
