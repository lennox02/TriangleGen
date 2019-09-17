package com.example.trianglegen;

import java.util.Arrays;

public class Triangle {
    public  String findTriangleType(double[] _userInputs){

        //Check if userInputs can make a triangle. The triangle inequality theorem
        //States that the sum of any 2 sides of a triangle must be greater than the 3rd side.
        //Shortcut: find two small side and add them together, if it is greater than the longer
        //side then it is a triangle.
        Arrays.sort(_userInputs);

        if(_userInputs[0] + _userInputs[1] > _userInputs[2]){
            //TODO: check if scalene, equilateral,and isosceles
            return ("It's some type of triangle");
        }else {
            return ("not a triangle");
        }
    };
}
