package no.kristiania;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args){
        System.out.println("Which number do you want in roman");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d in roman notation is %s", number, "I dont know");
    }
}
