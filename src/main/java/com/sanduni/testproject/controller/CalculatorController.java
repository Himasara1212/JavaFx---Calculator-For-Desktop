package com.sanduni.testproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private String operation;
    private String fristNumber;
    private String seccondNumber;


    @FXML
    private Label lblOperation;

    @FXML
    private Label lblPreviousNumber;

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

    @FXML
    void btnBackspace(ActionEvent event) {
       // - If only have 0 no need to do any thing
        if(!display.getText().equals("0") ){
//            String str = "Hello World";
//            String result = str.substring(0, str.length() - 1);
//            System.out.println(result); // "Hello Worl"

            if(display.getText().isEmpty()){
                display.setText("0");
            }else{
                String currenttext = display.getText();
                String updatedText = currenttext.substring(0, currenttext.length()-1);
                display.setText(updatedText);

                if(display.getText().equals("") || display.getText().equals(" ")){
                    display.setText("0");
                }
            }
        }
    }

    @FXML
    void btnDecimle(ActionEvent event) {
        if(display.getText().equals("") || display.getText().equals(" ") || display.getText().isEmpty()){
            display.setText("0");
        }

        String currenttext = display.getText();
        display.clear();
        display.setText(currenttext+".");
    }

    private void setDisplayValues(String mathOperation){
        if(display.getText().equals("") || display.getText().equals(" ") || display.getText().isEmpty()){
            display.setText("0");
        }

        fristNumber = display.getText();
        lblPreviousNumber.setText(fristNumber);

        operation = mathOperation;
        lblOperation.setText(operation);
        display.clear();
    }

    @FXML
    void btnAdd(ActionEvent event) {
       setDisplayValues("+");
    }

    @FXML
    void btnDecrement(ActionEvent event) {
        setDisplayValues("-");
    }

    @FXML
    void btnDevition(ActionEvent event) {
        setDisplayValues("/");
    }

    @FXML
    void btnMultiply(ActionEvent event) {
        setDisplayValues("*");
    }
}
