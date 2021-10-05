package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter what the test was out of: ");
        double maxMark = input.nextDouble();
        System.out.print("Enter what the student got: ");
        double studentMark = input.nextDouble();
        double percentage = Math.round( studentMark / maxMark * 100);

        if(percentage >= 80){
            System.out.println("A");
        }else if(percentage >= 70){
            System.out.println("B");
        }else if(percentage >= 60){
            System.out.println("C");
        }else if(percentage >= 50){
            System.out.println("D");
        }else if(percentage >= 40){
            System.out.println("E");
        }else{
            System.out.println("U");
        }
    }
}
