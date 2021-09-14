/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner lengthnumber = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String lengthnum = lengthnumber.nextLine();

        Scanner widthnumber = new Scanner (System.in);
        System.out.println("What is the width of the room in feet?");
        String widthnum = widthnumber.nextLine();

        int Length = Integer.parseInt(lengthnum);
        int Width = Integer.parseInt(widthnum);

        int area = Length * Width;
        double sqmeters = area * 0.09290304;

        System.out.println("You entered dimensions of " + Length + " feet by " + Width + " feet.");
        System.out.println("The area is\n" + area + " square feet\n" + sqmeters + " square meters");



    }
}