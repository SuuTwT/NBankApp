package nbank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

    static void printTitleScreen(String title){
        System.out.println("==========" + title.toUpperCase() + "==========");
        System.out.println("1. Bankowość Online");
        System.out.println("2. Obsługa Bankomatów");
        System.out.println("3. Panel Zarządzania");
        System.out.println("4. Wyjście");
    }

    static void printMessage(String message){
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    static int inputInt(String message){
        try{
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Podano błędną wartość");
            return inputInt(message);
        }
    }

    static String inputString(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
