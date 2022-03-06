package com.company;

public class Main {

    public static void main(String[] args) {
    // Action-1

        int RandNumber = (int) (Math.random() * (100 - 1));
    // Action-2
        if(RandNumber%2 == 0){
            System.out.println(RandNumber +" is an even number");
        }

        else{
            System.out.println((RandNumber +" is an odd number"));
        }

        //In action-1 we can see their With randNumber we can generate any number between 1 to 100 and with
        //action-2 we put randNumber%2 which means if and number %2 = 0 so it will be even number else odd number.
        
    }
}
