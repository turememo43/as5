package com.mehmetture.lib;

public class Operators {

    public static void main(String[] args) {

        int[] myNumbers = {12,15,18,21,24};

        for (int i = 0; i < myNumbers.length; i++){

            int x = myNumbers[i] / 3 * 5;
           System.out.println(x);
        }

        for (int number : myNumbers){
            System.out.println(number / 3 * 5);
        }


        // WHILE

        int j = 0;

        while ( j< 10 ) {

            int m = j * 20;
            System.out.println(m);
            j++;

        }


    }

}