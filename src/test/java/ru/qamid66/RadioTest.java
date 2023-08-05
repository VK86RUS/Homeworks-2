package ru.qamid66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }
    @Test
    void shouldSetCurrentRadioStationBackToZeroIfSize8() {
        Radio radio = new Radio(8);

        radio.setCurrentRadioStation(7);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        radio.changeOnPreviousRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        radio.changeOnNextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();

        radio.setVolume(101);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();

        radio.setVolume(100);
        radio.volumeUpForOne();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getVolume());

    }


    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();

        radio.setVolume(8);
        radio.volumeUpForOne();
        int expected = 9;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio();

        radio.setVolume(7);
        radio.volumeDownForOne();
        int expected = 6;
        assertEquals(expected, radio.getVolume());

    }
    @Test
    void shouldSetCurrentRadioStation30() {
        Radio radio = new Radio(35);

        radio.setCurrentRadioStation(30);

        int expected = 30;
        assertEquals(expected, radio.getCurrentRadioStation());

    }
    @Test
    void shouldSetCurrentRadioStation10() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());

    }
}