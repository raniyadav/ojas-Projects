package com.app.java8;


@FunctionalInterface
interface ArithInterface {
    void sum(int a,int b);
}
public class LamdaExpression {
    ArithInterface obj = (x,y)->{
        System.out.println("SUM = "+(x + y));
    };
    void disp() {
        obj.sum(20, 30);
    }
    public static void main(String[] args) {
        LamdaExpression obj = new LamdaExpression();
        obj.disp();
        
    }
}
 



