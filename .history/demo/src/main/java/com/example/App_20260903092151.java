package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day) {
            case "Monday":
                System.out.println("no");
                break;
            case "Tuesday":
                System.out.println("yes");
                break;
            default:
                break;
        }
    }
}
