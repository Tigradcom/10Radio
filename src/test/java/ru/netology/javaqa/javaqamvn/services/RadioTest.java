package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
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
            "5,4",
            "9,8",
            "0,9",
            "10,9",
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
            "5,6",
            "10,10",
            "0,1",
            "15,1",
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
            "10,9",
            "15,0",
            "-5,0"
    })
    public void pervVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.pervVolume();

        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void volumeMin() {
        Radio radio = new Radio();
        int currentVolume = 10;
        while (currentVolume >= 0) {
            radio.setCurrentVolume(currentVolume);
            currentVolume--;
        }
        radio.pervVolume();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,6",
            "3,9",
            "4,10",
            "10,10"
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

