package com.example.trianglegen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendFeedback(View Button) {
        EditText txtUserInput1 = findViewById(R.id.txtUserInput1);
        double UserInput1 = Double.parseDouble(txtUserInput1.getText().toString());

        EditText txtUserInput2 = findViewById(R.id.txtUserInput2);
        double UserInput2 = Double.parseDouble(txtUserInput2.getText().toString());

        EditText txtUserInput3 = findViewById(R.id.txtUserInput3);
        double UserInput3 = Double.parseDouble(txtUserInput3.getText().toString());

        //this should work
        double[] userInputs = {UserInput1,UserInput2,UserInput3};

        int validation = 0;

        for(double input : userInputs){
            if(!isOneToOneHundred(input)) {
                Toast.makeText(MainActivity.this, "Cannot have input less than 1 or Greater than 100", Toast.LENGTH_LONG).show();
                validation = 1;
            }
        }

        if(validation == 0) {

            Arrays.sort(userInputs);

            String displayTriangleType = "";
            displayTriangleType = findTriangleType(userInputs);

            Toast.makeText(MainActivity.this, displayTriangleType, Toast.LENGTH_LONG).show();
        }
    }

    public void closeApp(View Text){
        System.exit(0);
    }

    static String findTriangleType(double[] _userInputs){

        double lineA = _userInputs[0], lineB = _userInputs[1], lineC = _userInputs[2];

        //Check if userInputs can make a triangle. The triangle inequality theorem
        //States that the sum of any 2 sides of a triangle must be greater than the 3rd side.

        if(lineA + lineB > lineC && lineB + lineC > lineA && lineC +lineA >lineB){
            //TODO: check if scalene, equilateral,and isosceles
            if(isEquilateral(_userInputs)){
                return("Sides make an Equilateral!");
            } else if(isIsosceles(_userInputs)) {
                return("Sides make an Isosceles!");
            } else if(isScalene(_userInputs)) {
                return("Sides make a Scalene!");
            } else {
                return("Error! Sides make a triangle but not an Equilateral, Isosceles, or Scalene");
            }
        }else {
            return ("Not a triangle");
        }
    }

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
