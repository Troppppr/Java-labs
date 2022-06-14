package com.example.lab_11_gue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {



    @FXML
    private Label binary, third, fourth, fifth, sixth,seventh,eighth,ninth, result, error;
    @FXML
    private TextField numberReader,secondNumberReader, systemReader;


    @FXML
    protected void onHelloButtonClick() {
        String number = numberReader.getText();
        if(number.isEmpty()){
            error.setText("Ошибка! Введите значение");
        }else {
            int binarNumber = Integer.parseInt(number);
            if(binarNumber > -1) {
                binary.setText(translate(binarNumber, 2)); // setText метод задающий текст определенному Label
                third.setText(translate(binarNumber, 3));
                fourth.setText(translate(binarNumber, 4));
                fifth.setText(translate(binarNumber, 5));
                sixth.setText(translate(binarNumber, 6));
                seventh.setText(translate(binarNumber, 7));
                eighth.setText(translate(binarNumber, 8));
                ninth.setText(translate(binarNumber, 9));
            }else {
                error.setText("Ошибка! Введите положительное число");
            }
        }

    }

    public static String translate(int a, int c){
        int b;
        String temp = "";
        while(a !=0){
            b = a%c;
            temp = b + temp;
            a = a/c;
        } return temp;


    }

    public void onStartButtonClick() {
        String number = secondNumberReader.getText();
        String system = systemReader.getText();
        if(!number.isEmpty() && !system.isEmpty()){
            int c = Integer.parseInt(system);
            if(c > 1 && c < 10) {
                int binarNumber = Integer.parseInt(number);
                    result.setText(convertBinaryToDecimal(binarNumber, c));

            }else {
                result.setText("Ошибка! Введите значение в диапазоне от 2 до 9");
            }
        }else {
            result.setText("Ошибка! Введите значение");
        }

    }

    public static String convertBinaryToDecimal(int binaryDigit, int c) {
        int decimal = 0;
        int n = 0;
        int temp = 0;
        while (binaryDigit > 0) {
            temp = binaryDigit % 10;
            decimal += temp * Math.pow(c, n);
            binaryDigit = binaryDigit / 10;
            n++;
        }

        return ""+decimal; // перевод int в String
    }
}