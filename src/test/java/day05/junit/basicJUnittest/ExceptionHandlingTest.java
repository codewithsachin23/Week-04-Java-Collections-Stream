package day05.junit.basicJUnittest;

import org.day05.problemstatement.junit.basicJUnittest.testingexceptionhandling.TestingExceptionHandling;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandlingTest {

    @Test
    void divide(){
        assertEquals(5,TestingExceptionHandling.divide(10,2));
        assertEquals(2,TestingExceptionHandling.divide(10,5));
        assertEquals(3,TestingExceptionHandling.divide(10,3));
    }
    @Test
    void divideWithTryCatch(){
        try {
            assertEquals(5,TestingExceptionHandling.divide(10,0));
        }catch (ArithmeticException e){
            System.out.println("testing done"+e.getMessage());
        }
    }
    @Test
    void divideUsingException(){
       Exception exception=assertThrows(ArithmeticException.class,()->{
           TestingExceptionHandling.divide(10,0);
       });
    }
}
