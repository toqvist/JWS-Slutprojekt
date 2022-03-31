package com.example.slutprojekt.model;

public class CalcService {

    public String math(String operation, float value1, float value2) {
        System.out.println("doing math");
        float result = 0;
        switch (operation) {
            case "addition":
                result = value1 + value2;
                break;
            case "subtraction":
                result = value1 - value2;
                break;
            case "multiplication":
                result = value1 * value2;
                break;
            // case "division":
            // result = value1/value2;
            // break;
        }
        String resultJSON = "{\"result\":\"" + result + "\"}";
        return resultJSON;
    }

}