package com.example.trianglegen.test;

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

}
