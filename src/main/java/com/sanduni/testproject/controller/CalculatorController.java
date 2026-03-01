package com.sanduni.testproject.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField display;

    private String operation;
    private String firstNumber;
    private String secondNumber;

    @FXML
    private Label lblOperation;

    @FXML
    private Label lblPreviousNumber;

    private void checkIsNumberzero() {
        if (display.getText().equals("0")) {
            display.clear();
        }
    }

    @FXML
    void btn7(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 7);
    }

    @FXML
    void btn8(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 8);
    }

    @FXML
    void btn9(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 9);
    }

    @FXML
    void btn6(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 6);
    }

    @FXML
    void btn5(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 5);
    }

    @FXML
    void btn4(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 4);
    }

    @FXML
    void btn3(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 3);
    }

    @FXML
    void btn2(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 2);
    }

    @FXML
    void btn1(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 1);
    }

    @FXML
    void btn0(ActionEvent event) {
        checkIsNumberzero();
        String currentText = display.getText();
        display.clear();
        display.setText(currentText + 0);
    }

    @FXML
    void btnclear(ActionEvent event) {
        String currentText = display.getText();
        display.clear();
        display.setText("0");

        // REMOVING VARIABLE SAVED DATA
        operation = "";
        firstNumber = "";
        secondNumber = "";

        // REMOVEING THE DATA FROM UI
        lblOperation.setText("");
        lblPreviousNumber.setText("");
    }

    @FXML
    void btnBackspace(ActionEvent event) {
        // - If only have 0 no need to do anything
        if (!display.getText().equals("0")) {
            if (display.getText().isEmpty()) {
                display.setText("0");
            } else {
                String currenttext = display.getText();
                String updatedText = currenttext.substring(0, currenttext.length() - 1);
                display.setText(updatedText);

                if (display.getText().equals("") || display.getText().equals(" ")) {
                    display.setText("0");
                }
            }
        }
    }

    @FXML
    void btnDecimle(ActionEvent event) {
        if (display.getText().equals("") || display.getText().equals(" ") || display.getText().isEmpty()) {
            display.setText("0");
        }

        // Check karanna dot ekak danne nathi nam witharak denna
        if (!display.getText().contains(".")) {
            String currenttext = display.getText();
            display.clear();
            display.setText(currenttext + ".");
        }
    }

    private void setDisplayValues(String mathOperation) {
        // METHOD EKE WENADE KIYAWALA THEERUM GANNA
        if (display.getText().equals("") || display.getText().equals(" ") || display.getText().isEmpty()) {
            display.setText("0");
        }

        firstNumber = display.getText();
        lblPreviousNumber.setText(firstNumber);

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
    void btnModulas(ActionEvent event) {
        setDisplayValues("%");
    }

    @FXML
    void btnMultiply(ActionEvent event) {
        setDisplayValues("*");
    }

    @FXML
    void btnequl(ActionEvent event) {
        // Display eke thiyena number eka secondNumber widiyata save karaganna
        secondNumber = display.getText();

        // First number ,second number dala thyenawada check karanna
        if (firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty()) {
            display.setText("Error");
            return;
        }

        // Operation ekak thyenawada check karanna
        if (operation == null || operation.isEmpty()) {
            display.setText("Error");
            return;
        }

        // Calculations karanna
        try {
            // String values numbers walata convert karanna
            double num1 = Double.parseDouble(firstNumber);
            double num2 = Double.parseDouble(secondNumber);
            double result = 0;

            // calculation karanna
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Cannot divide by zero");
                        clearAfterError();
                        return;
                    }
                    break;
                default:
                    display.setText("Invalid Operation");
                    clearAfterError();
                    return;
            }

            // Result eka display karanna
            if (result == (int) result) {
                display.setText(String.valueOf((int) result));
            } else {
                display.setText(String.valueOf(result));
            }

            // Operation ha previous number clear karanna
            lblOperation.setText("");
            lblPreviousNumber.setText("");

            // First number eka save karanna
            firstNumber = display.getText();
            operation = ""; // Operation eka clear karanna

        } catch (NumberFormatException e) {
            display.setText("Invalid Number");
            clearAfterError();
        }
    }

    // Error ekak awoth clear karanna
    private void clearAfterError() {
        firstNumber = "";
        secondNumber = "";
        operation = "";
        lblOperation.setText("");
        lblPreviousNumber.setText("");
    }
}