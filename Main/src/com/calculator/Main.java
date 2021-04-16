package com.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Controller controller = new Controller();
        boolean startLoop = true;
        System.out.println(" ");
        System.out.println(":::::::::::::::: Hello, this is my first console calculator".toUpperCase()+" ::::::::::::::::");


        while (startLoop) {
            Scanner input2 = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Input first number:  ");
            int num1 = controller.getNumbers();
            controller.printMenu();
            char operation = controller.getOperation();
            System.out.print("Input second number:  ");
            System.out.println(" ");
            int num2 = controller.getNumbers();
            switch (operation) {
                case '+':
                    System.out.println("Result your operation = " + calculator.adding(num1, num2));
                    break;
                case '-':
                    System.out.println("Result your operation = " + calculator.subtraction(num1, num2));
                    break;
                case '*':
                    System.out.println("Result your operation = " + calculator.multiplication(num1, num2));
                    break;
                case '/':
                    System.out.println("Result your operation = " + calculator.division(num1, num2));
                    break;
                default:
                    System.out.println("Operation Unknown");

            }
            System.out.println(" ");
            System.out.println("Would you like to start the program again");
            System.out.println("                  yes / no");

            String startOver;
            startOver = input2.nextLine();

            if (startOver.contains("no")) {
                startLoop = false;
                System.out.println("All the best to you!!!!");

            }

        }

    }
}
