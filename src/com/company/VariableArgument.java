package com.company;
public class VariableArgument {
    static void varargs(int...arr){
        for (int e:arr){                  //This Method Can Run With Zero Arguments
            System.out.println(e);
        }
    }
    static void varargs2(int a,int...arr){
        System.out.println(a);
        for (int e:arr) {              //This Method Need one Minimum value
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        varargs(12,35,66);
        System.out.println("value req");
        varargs2(10,46,57,68);
    }
}
