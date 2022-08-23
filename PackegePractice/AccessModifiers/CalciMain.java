package Calci;

class Calculator{
    public void Add(int a,int b){
        System.out.println("Addition is "+ a+b);
    }
}
class ScCalci{
    public void Add(int a,int b){
        System.out.println(Math.sin(a+b));
    }
}
class hyCalci{
    void Add(int a,int b){
        System.out.println(a+b);

    }
    void hymeth(int x, int y){
        System.out.println(Math.sin(x+y));
    }
}
public class CalciMain {
    public static void main(String[] args) {
        Calculator c1 =new Calculator();
        ScCalci c2=new ScCalci();
        hyCalci c3=new hyCalci();
        c1.Add(12, 12);
        c2.Add(3, 5);
        c3.Add(4, 6);
        c3.hymeth(1, 2);
    }
}