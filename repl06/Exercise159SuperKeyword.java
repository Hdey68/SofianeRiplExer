package com.sofiane.repl06;

public class Exercise159SuperKeyword {
    /*
    Create class A
declare variable int i=10;

Create class B  extends A
declare variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
Expected Output:
20
10
    */

    static class A{
        int i=10;
    }
    static class B extends A{
        int i = 20;
        public void displayValue(){
            System.out.println(i);
            System.out.println(super.i);
    }
    }
    public static void main(String[] args) {
        B b=new B();
        b.displayValue();
    }
}
///////////////////////////////////////////////////////done/////////////////////////////////////////