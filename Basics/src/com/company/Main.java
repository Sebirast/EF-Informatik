package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Integer> dezInBin(int input, int devisor){
        int a = input;
        int result;
        List<Integer> resultArray = new ArrayList<>();

        if(devisor > input){
            input = devisor;
            devisor = a;
        }

        do{
            result = input % devisor;
            resultArray.add(result);
            input = input / devisor;

        }while(input != 0);

        Collections.reverse(resultArray);

        return resultArray;
    }

    public static String dezInHexa(int input){
        int devisor = 16;
        int a = 16;
        int interResult;
        String result = "";

        char[] hexCharacters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        if(devisor > input){
            input = devisor;
            devisor = a;
        }

        do{
            interResult = input % devisor;
            result += hexCharacters[interResult];
            input = input / devisor;

        }while(input != 0);

        return result;
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

    public static void zweierKomplement(byte[] input, boolean minusOrPlus){
        byte[] result = {};

        if(minusOrPlus){
            result[0] = 0;
        }

        int i = 1;
        for(byte a : input){
            if(a == 0)
                a = 1;
            else
                a = 0;
            result[i] = a;
        }
    }

    public static void main(String[] args) {
        // System.out.println(dezInBin(75, 2));
        // byte[] a = {1,0,1};
        // System.out.println(binInDez(a));
        System.out.println(dezInHexa(15));
    }
}