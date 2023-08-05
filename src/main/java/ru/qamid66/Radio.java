package ru.qamid66;


public class Radio {
    private int currentRadioStation;
    private int volume;

    private int radioSize = 10;
    private int minRadioStations = 0;
    private int maxRadioStations = radioSize -1;
    private int minVolune = 0;
    private int maxVolume = 100;
    public Radio(int radioSize) {
        maxRadioStations = radioSize -1;
    }
    public Radio() {
        radioSize = 10;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStations) {
            return;
        }
        if (currentRadioStation < minRadioStations) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentRadioStation == minRadioStations) {
            this.currentRadioStation = maxRadioStations;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeOnNextRadioStation() {
        if (currentRadioStation == maxRadioStations) {
            this.currentRadioStation = minRadioStations;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < minVolune) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void volumeUpForOne() {

        if (volume == maxVolume) {
            this.volume = volume;
        }
        if (volume < maxVolume) {
            this.volume++;
        }
    }

    public void volumeDownForOne() {
        if (volume == minVolune) {
            this.volume = volume;
        }
        if (volume > minVolune) {
            this.volume--;
        }
    }


}


