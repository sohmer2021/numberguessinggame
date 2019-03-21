package com.LickingHeights;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int secretNumber = (int)(Math.random()*100);
        System.out.println(secretNumber);
        int guess;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        while (!correct);

        System.out.println("Guess a number between one and one hundred");
        guess = keyboard.nextInt();

        if (guess > secretNumber) {
            System.out.println("Guess again, pick a lower number");
        } else if (guess < secretNumber) {
            System.out.println("Guess again, pick a higher number");
        } else if (guess == secretNumber) {
            correct = true;
            System.out.println("Correct!");
    }}}