package com.sofiane.repl08;

public class Exercise175AbstractClass {
    /*
   Create a Super Class Tea that will have:
  instance variable teaType;
  constructor that will initialize
  unimplemented method addSugar(),

  Create 2 subclasses of Tea as Lemon Tea and Chai Tea.

  In main class create an object of 2 Child and assign them to Parent reference type.
  Execute method addSugar from both classes.

  Expected Output:
  For Lemon Tea we need 2 spoons of sugar
  For Chai Tea we need 1 spoon of sugar
     */
    public static class Tea {
        String teaType;
        Tea() {
        }
        public void addSugar ( ) {
        }
         static class LemonTea extends Tea {
            @Override
            public void addSugar ( ) {
                System.out.println("For Lemon Tea we need 2 spoons of sugar");
                super.addSugar();
            }
        }
         static class ChaiTea extends Tea {
            @Override
            public void addSugar ( ) {
                System.out.println ( "For Chai Tea we need 2 spoons of sugar" );
                super.addSugar ( );
            }
        }
        public static void main(String[] args) {
            Tea tea = new LemonTea();
            tea.addSugar();
            Tea tea1 = new ChaiTea();
            tea1.addSugar();
        }
    }
}