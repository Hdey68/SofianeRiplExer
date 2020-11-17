package com.sofiane.repl06;

public class Exercise151ThisKeyword {
    /*
    Create variables as below.
item,
price,
quantity

Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice.
write a logic to to calculate the total values of items in stock. and print the result.
return the total value.

In Main Class.
Create two Object of ShoppingStore and pass the parameters to Constructor.
then using each object call the method itemTotalPrice.
Store the returned value of each object.
Calculate sum of both object and print the result.

Output:
Blanket Total Value 99.98
Mattress Total Value 439.18
You purchased 539.16 Today

Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,
This Keyword, Method Creation, Mathematic Operations, method return types.  method return types.
     */
    static class Main {
        String item;
        double price;
        int quantity;
        void ShoppingStore (String item, double price, int quantity){

            System.out.println(item+" Total Value "+price);
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }
        public static double itemTotalPrice(double price,double price1) {
            return price + price1;
        }

        public static void main(String[] args) {
            Main blanket =new Main();
            blanket.ShoppingStore("Blanket",99.98 ,1);

            Main mattress =new Main();
            mattress.ShoppingStore("Mattress",439.18,1);

            Main purchase= new Main() ;
            System.out.println("You purchased "+itemTotalPrice(blanket.price, mattress.price)+" Today");
        }}
}
