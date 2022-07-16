package com.company;

public class ArrayInReverse {
    public static void main(String[] args) {
        String [] numbers={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        for (int i=numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }

    }

}
