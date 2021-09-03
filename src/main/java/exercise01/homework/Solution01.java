package exercise01.homework;

import java.util.Scanner;
//ask for the users name
// take in users name
// print out a greeting using the users name

public class Solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?:");
        String Name = input.next();
        input.close();
        System.out.println("Hello," + " " + Name + " " + ",you seem to be an alright guy!");


    }
}
