package com.sofiane.repl06;

public class Exercise150ThisKeyword {
    /*
    In carObject class:
Create instance variables as below.
model
price,
quantity

Create a constructor that will initialize instance variables.

Create a method with name carStockValue.
Write logic to calculate the total values of cars in stock and print the result.

run the application in Main Class

Expected Output:
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0

Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.
     */
    static class CarObject {

        String model;
        double price;
        String quantity;

        CarObject(String model, String quantity, double price) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }

        void display() {
            System.out.println(model + " " + quantity + " " + price);
        }

        public static void main(String[] args) {
            CarObject car1 = new CarObject("Toyota 2019", "Stock Value", 2500000.0);
            CarObject car2 = new CarObject("BMW 2019", "Stock Value", 652980.0);
            car1.display();
            car2.display();
        }
    }
}
