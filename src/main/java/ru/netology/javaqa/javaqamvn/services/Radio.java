package ru.netology.javaqa.javaqamvn.services;

public class Radio {
    private int currentRadioStation;
    private int maxRadiostation = 9;
    private int minRadiostation = 0;

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
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void pervVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}













