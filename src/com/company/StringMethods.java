package com.company;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String words;
        System.out.println("Enter A String ");
        words=sc.nextLine();
        System.out.println("Character Length ==> "+words.length());
        System.out.println("Character LowerCase ==> "+words.toLowerCase());
        System.out.println("Character UpperCase ==> "+words.toUpperCase());
        System.out.println("Trimmed String ==> "+words.trim());
        System.out.println("Substring From Index 3 ==> "+words.substring(3));
        System.out.println("Substring From Index 2 to Index 5 ==> "+words.substring(2,5));
        System.out.println("Replacing 'a' to 'p' ==> "+words.replace('a','p'));
        System.out.println("Is String Start with 'As'==> "+words.startsWith("As"));
        System.out.println("Is String Ends with 'As'==> "+words.endsWith("tl"));
        System.out.println("Character At Index 6 ==> "+words.charAt(6));
        System.out.println("Index of Character 'ti' ==> "+words.indexOf("ti"));
        System.out.println("Index of Character 'ia' from Index 4 ==> "+words.indexOf("ia",4));
        System.out.println("Last Index of 'so' ==>"+words.lastIndexOf("so"));
        System.out.println("Last Index of 'so' Between 5 Chars ==>"+words.lastIndexOf("so"));
        System.out.println("Is Given String is Equals To 'Association ==> "+words.equals("Association"));
        System.out.println("Given String is Equal to 'Associativity ==> "+words.equalsIgnoreCase("associativity"));

    }
}
