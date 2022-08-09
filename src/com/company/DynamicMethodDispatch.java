package com.company;

class Phone{
    void On(){
        System.out.println("Phone is Turning On....");
    }
    void msg(){
        System.out.println("Phone Turned On Successfully");
    }
}
class SmartPhone extends Phone{
    void On(){
        System.out.println("SmartPhone is turning On....");
    }
    void music(){
        System.out.println("I am now Playing Music");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj=new SmartPhone();
        SmartPhone obj2=new SmartPhone();
        obj.On();
        obj.msg();
        obj2.music();
        //obj.music(); we can't do this because we created object of Class Smartphone by using Phone Class Reference. So, We can only call overrided Methods and Methods of Parent Class
    }
}
