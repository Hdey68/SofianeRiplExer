package com.sofiane.repl05;

public class Exercise139AccessModifiers {
    /*
    For you to do:
Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

In each method write the logic accordingly like for private method write the logic in the println Statement as
 "This is Private Method" accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs,
  please make sure they are in the same order that is printed below.

Expected Output:
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
     */
    static class Main {
        private void msg1() {
            System.out.println("This is Private Method");
        }
        void msg2() {
            System.out.println("This is Default Method");
        }
        protected void msg3() {
            System.out.println("This is Protected Method");
        }
        public void msg4() {
            System.out.println("this is Public Method");
        }
        public static void main(String[] args) {
            Main obj = new Main();
            obj.msg1();
            obj.msg2();
            obj.msg3();
            obj.msg4();

        }
    }///////////////////////////////////////////////done///////////////////////////////////////////////
}