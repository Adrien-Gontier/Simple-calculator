package com.example.simplecalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Objects;

public class HelloController {

    @FXML
    Double result = 0.0;

    @FXML
    Double operation = 0.0;

    @FXML
    public Label numberLabel;

    @FXML
    Double doubleOneOperation = 0.0;

    @FXML
    Double doubleTwoOperation = 0.0;

    @FXML
    String stringOneOperation = "";

    @FXML
    String stringTwoOperation = "";

    @FXML
    Boolean divide = false;

    @FXML
    Boolean multiply = false;

    @FXML
    Boolean plus = false;

    @FXML
    Boolean subtract = false;

    @FXML
    public Button ACCButton;

    @FXML
    protected void textACButton() {
        if(!Objects.equals(stringOneOperation, "")) {
            ACCButton.setText("C");
        } else if (!Objects.equals(stringTwoOperation, "")) {
            ACCButton.setText("C");
        }
    }

    @FXML
    protected void resetZeroBoolean() {
        divide = false;
        multiply = false;
        plus = false;
        subtract = false;
    }

    @FXML
    protected void oneOperation() {
        doubleTwoOperation = Double.valueOf(stringTwoOperation);
        stringTwoOperation = "";
        if (divide) {
            operation = doubleOneOperation / doubleTwoOperation;
        }
        if (subtract) {
            operation = doubleOneOperation - doubleTwoOperation;
        }
        if (plus) {
            operation = doubleOneOperation + doubleTwoOperation;
        }
        if (multiply) {
            operation = doubleOneOperation * doubleTwoOperation;
        }
        doubleOneOperation = operation;
        resetZeroBoolean();
    }

    @FXML
    protected void onSUPPButtonClick() {
        numberLabel.setText("0");
        doubleOneOperation = 0.0;
        doubleTwoOperation = 0.0;
        stringOneOperation = "";
        stringTwoOperation = "";
        result = 0.0;
        operation = 0.0;
        ACCButton.setText("AC");
        resetZeroBoolean();
    }

    @FXML
    protected void onACButtonClick() {
        if (doubleTwoOperation != 0.0) {
            stringTwoOperation = "";
        }else{
            stringOneOperation = "";
        }
        if(Objects.equals(stringOneOperation, "")) {
            onSUPPButtonClick();
        }
        if (stringTwoOperation.equals("")) {
            onSUPPButtonClick();
        }
        numberLabel.setText("0");
        ACCButton.setText("AC");
    }

    @FXML
    protected void onDivideButtonClick() {
        if(stringTwoOperation.equals("")) {
            doubleOneOperation = Double.valueOf(stringOneOperation);
        }else{
            oneOperation();
        }
        divide = true;
    }

    @FXML
    protected void onMultiplyButtonClick() {
        if(stringTwoOperation.equals("")) {
            doubleOneOperation = Double.valueOf(stringOneOperation);
        }else{
            oneOperation();
        }
        multiply = true;
    }

    @FXML
    protected void on7ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("7");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("7");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on8ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("8");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("8");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on9ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("9");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("9");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void onSubtractButtonClick() {
        if(stringTwoOperation.equals("")) {
            doubleOneOperation = Double.valueOf(stringOneOperation);
        }else{
            oneOperation();
        }
        subtract = true;
    }

    @FXML
    protected void on4ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("4");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("4");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on5ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("5");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("5");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on6ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("6");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("6");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void onPlusButtonClick() {
        if(stringTwoOperation.equals("")) {
            doubleOneOperation = Double.valueOf(stringOneOperation);
        }else{
            oneOperation();
        }
        plus = true;
    }

    @FXML
    protected void on1ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("1");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("1");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on2ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("2");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("2");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on3ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("3");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("3");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void on0ButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat("0");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat("0");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void onDotButtonClick() {
        if(doubleOneOperation == 0.0) {
            stringOneOperation = stringOneOperation.concat(".");
            numberLabel.setText(stringOneOperation);
        }
        if (doubleOneOperation != 0.0){
            stringTwoOperation = stringTwoOperation.concat(".");
            numberLabel.setText(stringTwoOperation);
        }
        textACButton();
    }

    @FXML
    protected void onEqualButtonClick() {
            oneOperation();
            resetZeroBoolean();
            result = operation;
            numberLabel.setText(String.valueOf(result));
    }

}