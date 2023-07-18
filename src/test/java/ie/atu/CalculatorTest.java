package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

     Calculator testCalculator;

        @BeforeEach
        void setUp() {
            testCalculator = new Calculator();
        }

        @Test
        void testAdd(){

        int first = 11;
        int second = 11;

         assertEquals(21,testCalculator.add(first,second));
        }
        @AfterEach
        void tearDown() {
        }
}