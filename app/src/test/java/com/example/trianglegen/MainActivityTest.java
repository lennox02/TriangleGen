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

        //equilateral
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

    @Test
    public void isEquilateralTest() {

        MainActivity tester = new MainActivity();

        //definitely Equilateral
        double[] userInputs = {3,3,3};
        assertTrue(tester.isEquilateral(userInputs));

        //Scalene
        double[] userInputs2 = {3,5,7};
        assertFalse(tester.isEquilateral(userInputs2));

        //Isosceles
        double[] userInputs3 = {3,3,5};
        assertFalse(tester.isEquilateral(userInputs3));

        //Not a triangle
        double[] userInputs4 = {4,4,8};
        assertFalse(tester.isEquilateral(userInputs4));

    }

    @Test
    public void isIsoscelesTest() {

        MainActivity tester = new MainActivity();

        //Equilateral
        double[] userInputs = {3,3,3};
        assertFalse(tester.isIsosceles(userInputs));

        //Scalene
        double[] userInputs2 = {3,5,7};
        assertFalse(tester.isIsosceles(userInputs2));

        //Isosceles
        double[] userInputs3 = {3,3,5};
        assertTrue(tester.isIsosceles(userInputs3));

        //Isosceles
        double[] userInputs4 = {3,5,3};
        assertTrue(tester.isIsosceles(userInputs4));

        //Isosceles
        double[] userInputs5 = {5,3,3};
        assertTrue(tester.isIsosceles(userInputs5));

    }

    @Test
    public void isScaleneTest() {

        MainActivity tester = new MainActivity();

        //Equilateral
        double[] userInputs = {3,3,3};
        assertFalse(tester.isScalene(userInputs));

        //Scalene
        double[] userInputs2 = {3,5,7};
        assertTrue(tester.isScalene(userInputs2));

        //Isosceles
        double[] userInputs3 = {3,3,5};
        assertFalse(tester.isScalene(userInputs3));

        //Isosceles
        double[] userInputs4 = {3,5,3};
        assertFalse(tester.isScalene(userInputs4));

        //Isosceles
        double[] userInputs5 = {5,3,3};
        assertFalse(tester.isScalene(userInputs5));

    }

}
