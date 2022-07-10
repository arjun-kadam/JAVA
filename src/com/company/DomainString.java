package com.company;
import java.util.Scanner;
public class DomainString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter Domain ");
        word = sc.nextLine();

        if (word.endsWith(".in")) {
            System.out.println("Indian Domain");

        } else if (word.endsWith(".com")) {
            System.out.println("Commercial Domain");

        } else if (word.endsWith(".org")) {
            System.out.println("Organization Domain");

        }else if (word.endsWith(".gov")) {
            System.out.println("Government Domain");

        }else if (word.endsWith(".dev")) {
            System.out.println("Development Domain");

        }else if (word.endsWith(".net")) {
            System.out.println("Network Domain");

        }else {
            System.out.println("Enter Valid Domain  !!!");
        }
    }
}
