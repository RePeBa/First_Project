package com.company;

import java.util.Scanner;

public class KBDIN {
    public static void main(String[] args){

        int number;
        System.out.println("Wprowadź liczbę");
        Scanner kybd = new Scanner(System.in);
        number = kybd.nextInt();
        System.out.println("Ta liczba to: " + number);

        String wpis;
        System.out.println("Wprowadź napis");
        Scanner kybd1 = new Scanner(System.in);
        wpis = kybd1.nextLine();
        System.out.println("Ten napis to: " + wpis);

        byte bajt;
        System.out.println("Wprowadź bajt");
        Scanner kybd2 = new Scanner(System.in);
        bajt = kybd2.nextByte();
        System.out.println("Ten bajt to: " + bajt);

        boolean b;
        System.out.println("Wprowadź boolean - whatever it is");
        b = false;
        Scanner kybd3 = new Scanner(System.in);
        b = kybd3.nextBoolean();
        System.out.println("Ten bajt to: " + b);

        String x;

        System.out.println("Wprowadź 'T' [dla tak] lun 'N'  [dla nie]");
        Scanner kybd4 = new Scanner(System.in);
        x = kybd4.nextLine();
        char z;
        z = x.charAt(0);
        System.out.println("Ten znak to : " + z);

    }

}

