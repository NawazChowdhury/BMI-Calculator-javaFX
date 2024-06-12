package com.example.bmiclaculators24;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {

    public TextField Weight;
    public TextField Height;
    public Label message;

    public void ClaculateBMI(ActionEvent actionEvent) {

        String weight = Weight.getText();

        String height = Height.getText();


        Double w = Double.parseDouble(weight);
        Double h = Double.parseDouble(height);
        Double he = h / 100;

        Double res = w / (he * he);

        DecimalFormat df = new DecimalFormat("#.##");
        String result = df.format(res);

        message.setText("Your BMI is " + result);



    }
}