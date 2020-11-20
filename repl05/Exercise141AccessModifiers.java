package com.sofiane.repl05;

public class Exercise141AccessModifiers {

    /*
    In AnotherClass declare a private, default, protected,
    public methods and have them each return the name of the what access modifier they are using.
    All methods should be accessible by class name

   Call methods of Another class inside Main class

   Expected Output:
   default
   protected
   public
     */
    static class AnotherClass {
        private void m1() {
            System.out.println("private");
        }
        void m2() {
            System.out.println("default");
        }
        protected void m3() {
            System.out.println("protected");
        }
        public void m4() {
            System.out.println("public");
        }
        public static void main(String[] args) {
            AnotherClass obj = new AnotherClass();
            obj.m1();
            obj.m2();
            obj.m3();
            obj.m4();
        }

    }
}

