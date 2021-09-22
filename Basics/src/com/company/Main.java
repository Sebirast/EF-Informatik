package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
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

        char[] hexCharacters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

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

    public static int binInDez(byte[] input){
        int result = 0;

        for(int i = input.length; i > 0; i--){
            if(input[i-1] == 1){
                result += Math.pow(2, i-1);
            }
        }

        return result;
    }

    public static byte[] dezToBinFloat(float input){
        int whole =
        return null;
    }

    public static void main(String[] args) {
//        System.out.println(dezInBin(75, 16));
//        byte[] a = {1,0,1};
//        System.out.println(binInDez(a));
        System.out.println(dezInHexa(200));
    }
}