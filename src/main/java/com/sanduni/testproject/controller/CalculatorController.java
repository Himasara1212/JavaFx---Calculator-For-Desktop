package com.sanduni.testproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private String operation;
    private String fristNumber;
    private String seccondNumber;

    private void checkIsNumberzero(){
        if(display.getText().equals("0")){
            display.clear();
        }
    }

    @FXML
    void btn7(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+7);
    }

    @FXML
    void btn8(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+8);
    }

    @FXML
    void btn9(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+9);
    }

    @FXML
    void btn6(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+6);
    }

    @FXML
    void btn5(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+5);
    }

    @FXML
    void btn4(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+4);
    }

    @FXML
    void btn3(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+3);
    }

    @FXML
    void btn2(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+2);
    }

    @FXML
    void btn1(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+1);
    }

    @FXML
    void btn0(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText+0);
    }

    @FXML
    void btnclear(ActionEvent event) {
        String currentText = display.getText();
        display.clear();
        display.setText("0");
    }



}
