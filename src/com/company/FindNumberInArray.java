package com.company;
import java.util.Scanner;
public class FindNumberInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []num={10,20,30,40,50,60,70};
        int key;
        boolean isPresent=false;
        System.out.println("Enter Element To Be Search ");
        key=sc.nextInt();
        for (int element:num){
            if (element==key){
                isPresent=true;
                break;
            }
        }
        if (isPresent){
            System.out.println("Element is Present");
        }else {
            System.out.println("Element is NOT Present");
        }
    }
}
