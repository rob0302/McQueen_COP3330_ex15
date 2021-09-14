/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class password {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        String password = "123itsme";

        System.out.print("What is the username? ");
String username = sc.nextLine();
        System.out.print("What is the password? ");
        String passTest = sc.nextLine();

        if(passTest.equals(password)){
            System.out.print("Welcome!");
        }else
            System.out.print("I don't know you.");
    }

}
