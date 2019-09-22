package com.example.trianglegen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This should fail
        //double[] userInputs ={1,5,3};

        //this should work
        double[] userInputs = {3,10,8};

        for(double input : userInputs){
            if(isOneToOneHundred(input)) {
                //todo error message here
            }
        }

        Arrays.sort(userInputs);

        if(!isTriangle(userInputs)) {
            //todo return error message that sides are not triangle
        }

        //todo return this success message to interface
        String triangleType = triangleType(userInputs);

        String displayTriangleType = "";
        displayTriangleType = findTriangleType(userInputs);

        Toast.makeText(MainActivity.this, displayTriangleType, Toast.LENGTH_LONG).show();
    }
    static String findTriangleType(double[] _userInputs){

        double lineA = _userInputs[0], lineB = _userInputs[1], lineC = _userInputs[2];

        //Check if userInputs can make a triangle. The triangle inequality theorem
        //States that the sum of any 2 sides of a triangle must be greater than the 3rd side.

        if(lineA + lineB > lineC && lineB + lineC > lineA && lineC +lineA >lineB){
            //TODO: check if scalene, equilateral,and isosceles
            return ("It's some type of triangle");
        }else {
            return ("not a triangle");
        }
    };

    public static boolean isOneToOneHundred(double number) {

        if(number >= 1 && number <= 100){
            return true;
        }

        return false;

    }

    public static boolean isTriangle(double[] sides) {

        if(sides[0] + sides[1] > sides[2]){
            return true;
        }else {
            //todo not a triangle message
            return false;
        }

    }

    public static boolean isThreeInputs(double[] inputs) {

        int inputsLength = inputs.length;

        if(inputsLength < 3 || inputsLength > 3) {
            return false;
        }

        return true;

    }

    public static String triangleType(double[] sides) {

         if(isEquilateral(sides)){
             //todo replace with success message
             return "Equilateral";
         } else if(isIsosceles(sides)){
             return "Isosceles";
         } else if(isScalene(sides)){
             return "Scalene";
         }

        //todo replace with error message
         return "Triangle Type Not Found";

    }

    public static boolean isEquilateral(double[] sides) {

        if(sides[0] == sides[1] && sides[0] == sides[2]){
            return true;
        }

        return false;

    }

    public static boolean isIsosceles(double[] sides) {

        if(
            (sides[0] == sides[1] && sides[0] != sides[2]) ||
            (sides[1] == sides[2] && sides[1] != sides[0]) ||
            (sides[2] == sides[0] && sides[2] != sides[1])
        ){
            return true;
        }

        return false;

    }

    public static boolean isScalene(double[] sides) {

        if(sides[0] != sides[1] && sides[0] != sides[2] && sides[1] != sides[2]){
            return true;
        }

        return false;

    }

}
