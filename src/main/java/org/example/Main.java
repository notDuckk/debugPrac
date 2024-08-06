package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> calcArry = new ArrayList<>();
        calcArry.add(1);
        calcArry.add(2);
        calcArry.add(3);
        calcArry.add(4);
        calcArry.add(5);
        //where I implemented a null pointer exception
        // calcArry.add(null);  // I had to comment this out because it was throwing a null pointer exception

        //where i introducted a indexoutofboundes excpetion
        // calcArry.get(7); // i had to comment this out because it was throwing a indexout of bounds exception
        // i used the debugger to set breakpoints and step through the program to find these errors

        System.out.println(calcAvg(calcArry));
    }

    public static double calcAvg(ArrayList<Integer> array) {
        double sum = 0;
        int count = 0;
        for (int el: array){
            // this is to show me what the program is counting
            System.out.println(el);
            sum += el;
            count++;
        }
        //shows me what the sum and the count are after the foreach loop.
        System.out.println("sum: " + sum + ", count: " + count);

        // I used the debugger here to finally figure out why it was not giving me the correct number and it ended up being because I
        // had numbers mixed up :(
        // return count/sum;

        //correct return statement;
        return sum/count;
    }
}