package com.company;

public class AvgOfArguments {
    static void avg(int...arr) {
        int res = 0;
        int length= arr.length;
        for (int i = 0; i < length; i++) {
            res +=arr[i];
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        avg(10,2,2,1);
    }
}
