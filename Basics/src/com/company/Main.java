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

    public static void main(String[] args) {
        System.out.println(dezInBin(7, 2));
    }
}
