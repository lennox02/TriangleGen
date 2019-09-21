package com.example.trianglegen.test;

import com.example.trianglegen.MainActivity;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {

    //@Test must be capitalized
    @Test
    public void firstExampleTest(){
        assertTrue(true);
    }

    //should fail
    @Test
    public void secondExampleTest(){
        assertTrue(false);
    }

    @Test
    public void oneToOneHundredTest() {

        MainActivity tester = new MainActivity();

        assertTrue(tester.isOneToOneHundred(10));
        assertTrue(tester.isOneToOneHundred(10.5));
        assertTrue(tester.isOneToOneHundred(1));
        assertTrue(tester.isOneToOneHundred(100));

        assertFalse(tester.isOneToOneHundred(0));
        assertFalse(tester.isOneToOneHundred(-1));
        assertFalse(tester.isOneToOneHundred(200));
    }

}
