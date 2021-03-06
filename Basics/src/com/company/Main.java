package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static char[] hexCharacters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static enum toNumberSystem{
        toDez,
        toBin,
        toHex
    }

    public static List<Integer> dezInBin(int input, int divisor){
        int a = input;
        int result;
        List<Integer> resultArray = new ArrayList<>();

        if(divisor > input){
            input = divisor;
            divisor = a;
        }

        do{
            result = input % divisor;
            resultArray.add(result);
            input = input / divisor;

        }while(input != 0);

        Collections.reverse(resultArray);

        return resultArray;
    }

    public static String dezInHexa(int input){
        int devisor = 16;
        int interResult;
        String result = "";


        if(devisor > input){
            return String.valueOf(hexCharacters[input]);
        }

        do{
            interResult = input % devisor;
            result += hexCharacters[interResult];
            input = input / devisor;

        }while(input != 0);

        StringBuilder output = new StringBuilder(result).reverse();

        return output.toString();
    }

    public static int binToDez(byte[] input){
        int result = 0;

        for(int i = input.length; i > 0; i--){
            if(input[i-1] == 1){
                result += Math.pow(2, i-1);
            }
        }
        return result;
    }

    public static int HexToDez(String input){
        String digits = "0123456789ABCDEF";
        input = input.toUpperCase();
        int result = 0;

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int d = digits.indexOf(c);
            result = 16 * result + d;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(HexToDez("20"));
    }
}