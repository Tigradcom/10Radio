package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "5,6",
            "0,1",
            "9,0",
            "10,1",
            "-1,1"
    })

    public void nextStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        radio.nextStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "15,16",
            "0,1",
            "18,19",
            "19,0",
            "-1,1",
            "50,1",
    })

    public void nextStationAmount(int currentRadioStation, int expected) {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(currentRadioStation);

        radio.nextStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "5,4",
            "9,8",
            "0,9",
            "15,9",
            "-1,9"
    })
    public void pervStation(int currentRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(currentRadioStation);

        radio.pervStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "5,4",
            "14,13",
            "0,14",
            "15,14",
            "-1,14"
    })
    public void pervStationAmount(int currentRadioStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(currentRadioStation);

        radio.pervStation();

        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "75,76",
            "100,100",
            "0,1",
            "150,1",
            "-5,1"
    })
    public void nextVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.nextVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "6,5",
            "0,0",
            "100,99",
            "150,0",
            "-5,0"
    })
    public void pervVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.pervVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "0,6",
            "3,9",
            "96,100",
            "100,100"
    })
    public void volumeMax(int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);

        radio.nextVolume();
        radio.nextVolume();
        radio.nextVolume();
        radio.nextVolume();
        radio.nextVolume();
        radio.nextVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "10,4",
            "7,1",
            "5,0",
            "0,0"
    })
    public void volumeMin(int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);

        radio.pervVolume();
        radio.pervVolume();
        radio.pervVolume();
        radio.pervVolume();
        radio.pervVolume();
        radio.pervVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }
}

