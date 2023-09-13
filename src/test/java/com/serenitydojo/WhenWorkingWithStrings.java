package com.serenitydojo;

import org.junit.Test;

import javax.sound.midi.Soundbank;

public class WhenWorkingWithStrings {

    @Test
    public void workingWithStrings() {

        String fullName = "Abdi Noor";

        String convertingToLowerCase = fullName.toLowerCase();
        String convertingToUpperCase = fullName.toUpperCase();
        String trimExtraSpace = fullName.trim();

        String replacingText = fullName.replace("Abdi Noor", "Nasir Saeed");

        System.out.println(convertingToLowerCase);
        System.out.println(convertingToUpperCase);
        System.out.println(trimExtraSpace.length());
        System.out.println(replacingText);



    }

}
