package edu.whccd.dramirez;

/*
The use of this application is to show the use of arrays and array list and being able to input into a array.
author: Delrio Ramirez
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade1 = sc.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade2 = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade3 = sc3.nextDouble();

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade4 = sc4.nextDouble();

        Scanner sc5 = new Scanner(System.in);
        System.out.print("Enter grade (0-100): ");
        double grade5 = sc5.nextDouble();
        double[] grades = {grade1, grade2,grade3,grade4,grade5} ;

        System.out.println( "\n" +"**********************************************" + "\n");


        System.out.println("Used a for loop to Iterate through the grades Array" + "\n");

        double total = 0;
        for (double grade : grades) {
            total += grade;
            System.out.println(grade);
        }
        double average = total / grades.length;
        System.out.println("Grades length: " + grades.length);
        System.out.println("Grade Total: " + total );
        System.out.println("Grade Average: " + average);

        System.out.println( "\n" +"**********************************************" + "\n");

        ArrayList<String> cities = new ArrayList<>(20);
        Scanner sc6 = new Scanner(System.in);
        String continueFlag;
        do {
            System.out.print("Enter city name: ");
            String city = sc6.nextLine();
            cities.add(city);

            System.out.print("Enter more cities (y/n)? ");
            continueFlag =sc.next();
        }while(continueFlag.equalsIgnoreCase("y"));

        System.out.println("Use a for each loop to traverse through the cities ArrayList");

        Collections.sort(cities);

        for (String city : cities) {
            System.out.println(city);
        }
        System.out.print("Cities Size: " + cities.size());


    }
}
