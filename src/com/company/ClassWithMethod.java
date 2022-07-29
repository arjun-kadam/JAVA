package com.company;
class MethodClass{
    int Uid;
    String name;
    public void showDetails(){
        System.out.println("User ID: "+Uid);
        System.out.println("User Name: "+ name);
    }
}
public class ClassWithMethod {
    public static void main(String[] args) {
        MethodClass User1=new MethodClass();
        MethodClass User2=new MethodClass();
        //Setting Attributes
        User1.Uid=101;
        User1.name="Arjun";
        User2.Uid=102;
        User2.name="Harry";

        //Calling Method Inside Class
        User1.showDetails();
        User2.showDetails();

    }
}
