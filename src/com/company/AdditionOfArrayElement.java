package com.company;

public class AdditionOfArrayElement {

    public static void main(String[] args) {
        float [] marks= {50.54f,60.75f,90.50f,78.98f,84.40f};
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        float avg=sum/marks.length;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
    }

}
