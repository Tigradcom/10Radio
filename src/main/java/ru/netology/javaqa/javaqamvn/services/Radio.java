package ru.netology.javaqa.javaqamvn.services;

public class Radio {
    private int maxRadiostation;
    private int minRadiostation;
    private int currentRadioStation = minRadiostation;

    public Radio() {
        maxRadiostation = 9;
        minRadiostation = 0;
    }

    public Radio(int amount) {
        maxRadiostation = amount - 1;
    }

    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadiostation) {
            return;
        }
        if (currentRadioStation > maxRadiostation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation < maxRadiostation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadiostation;
        }
    }

    public void pervStation() {
        if (currentRadioStation > minRadiostation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadiostation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void pervVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }
}













