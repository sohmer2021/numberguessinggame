package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /*int pickedNumber = (int)(Math.random()*100);
        System.out.println(pickedNumber);
        boolean correct = false;

        Scanner keyboard;
        int numberOfGuesses = 0;
        int input;
        keyboard = new Scanner (System.in);

        System.out.println("Guess a number between 1 and 100");

        if (input > pickedNumber) {
            System.out.println("Guess again, pick a lower number");
        } else if (input < pickedNumber) {
            System.out.println("Guess again, pick a higher number");
        } else if (input == pickedNumber) {
            System.out.println("The number is correct!");







       }
    }}*/
        int secretNumber;
        int guess;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Secret Number:");
        secretNumber = keyboard.nextInt();
        while (!correct);

        System.out.println("Guess a number between one and one hundred");
    }}