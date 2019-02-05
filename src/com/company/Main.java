package com.company;

public class Main {

    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        double answer1 = 0;
        double answer2 = 0;

        for(double n = 1; n <= 50000; n++){
            sum1 += (1/n);
        }

        System.out.println("Left to right sum: " + sum1);

        for(double n = 50000; n >= 1; n--){
            sum2 += (1/n);
        }


        System.out.println("Right to left sum: " + sum2);

    }
}
