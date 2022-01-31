package quru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest4 {

    @Test
    void test1() {
        Assertions.assertTrue(100500 % 2 == 0);
    }
}
