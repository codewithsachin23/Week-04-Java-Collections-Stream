package org.day04.problemstatement.exceptions.exceptionpropagationmethods;

public class ExceptionPropagationInMethods {
    public static void method1()throws ArithmeticException{
        System.out.println("Inside method1...");
        throw new ArithmeticException("division by zero");
    }
     public static void method2(){
         System.out.println("Inside method2...");
        method1();
    }

    public static void main(String[] args) {
      try {
          System.out.println("Inside main...");
          method2();;
      }catch (ArithmeticException e){
          System.out.println("Handled exception in main "+ e.getMessage());
      }
    }
}
