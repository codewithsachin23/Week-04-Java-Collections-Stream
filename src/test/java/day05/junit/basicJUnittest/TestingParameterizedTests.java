package day05.junit.basicJUnittest;
import org.day05.problemstatement.junit.basicJUnittest.testevenodd.IsEven;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingParameterizedTests {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    void isEvenTest(int number){
        IsEven isEven=new IsEven();
       boolean actual= isEven.isEven(number);
        assertTrue(actual);

    }
    @ParameterizedTest
    @ValueSource(ints = {3,7})
    void isOddTest(int number){
        IsEven isEven=new IsEven();
       boolean actual= isEven.isEven(number);
        assertFalse(actual);

    }
}
