package com.serenitydojo;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class WhenWorkingWithFloatingPointNumbers {

    @Test
    public void convertingANumberFromCelciusToFarenheit() {

        int celcius = 35;
        int farenheit = 41;

        int convert = celcius * farenheit;

        System.out.println("Converting" + convert);

    }
}
