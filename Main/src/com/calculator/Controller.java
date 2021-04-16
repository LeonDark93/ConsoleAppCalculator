package com.calculator;

import java.util.Scanner;
public class Controller {
    Scanner input = new Scanner(System.in);


    public void printMenu(){
        System.out.println("Chose one of operation:");
        System.out.println(" ");
        System.out.println(" Adding         [+]");
        System.out.println(" Subtraction    [-]");
        System.out.println(" Multiplication [*]");
        System.out.println(" Division       [/]");
    }


    public int getNumbers(){
        int num = 0;
        boolean repeat = false;
        do{
            if(repeat){
                System.out.println(" You make a mistake in input number.Try again");
                repeat = false;
            }

            if(!input.hasNextInt()){
                repeat = true;
                input.next();

            } else {
                num = input.nextInt();
            }

        } while (repeat);
        return num;

    }

    public char getOperation(){
        char operation;
        boolean repeat = false;
         do{
             if(repeat){
                 System.out.println(" You make a mistake in input operation. Try Again");
                 repeat = false;
             }
             System.out.println(" ");
             System.out.print(" Enter one of operation:  ");
             operation = input.next().charAt(0);
             repeat = true;

         }while(!isCheckedOperation(operation));
         return operation;
    }


    public boolean isCheckedOperation(char operation){
        switch (operation){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                System.out.println(" Not recognized operation");
                return false;
        }
    }


}
