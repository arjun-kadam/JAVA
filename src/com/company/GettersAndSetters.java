package com.company;

class GettersSetters{
    private int a;
    private String name;
    public void setValue(int n){
        a=n;
    }
    public void setName(String get){
        name=get;
    }
    public int getVal(){
        return a;
    }
    public String getNam(){
        return name;
    }
}
public class GettersAndSetters {
    public static void main(String[] args) {
        GettersSetters in=new GettersSetters();
        in.setValue(12);
        in.setName("ArjunK");
        System.out.println("Value Set is "+in.getVal());
        System.out.println("Name Is Set "+ in.getNam());
    }
}
