package quru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void testAssert(){
        //add condition for test
        Assertions.assertTrue(3>0);
    }
}
