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

    @Test
    public void isTriangleTest() {

        MainActivity tester = new MainActivity();

        //equillateral
        double[] userInputs = {3,3,3};
        assertTrue(tester.isTriangle(userInputs));

        //scalene
        double[] userInputs2 = {3,5,7};
        assertTrue(tester.isTriangle(userInputs2));

        //isosceles
        double[] userInputs3 = {3,3,5};
        assertTrue(tester.isTriangle(userInputs3));

        double[] userInputs4 = {3,4,8};
        assertFalse(tester.isTriangle(userInputs4));

        double[] userInputs5 = {4,4,8};
        assertFalse(tester.isTriangle(userInputs5));

    }

    @Test
    public void isThreeInputsTest() {

        MainActivity tester = new MainActivity();

        //less than three inputs
        double[] userInputs = {3,3};
        assertFalse(tester.isThreeInputs(userInputs));

        double[] userInputs2 = {3,3,3,3};
        assertFalse(tester.isThreeInputs(userInputs2));

        double[] userInputs3 = {3,3,3};
        assertTrue(tester.isThreeInputs(userInputs3));

    }

}
