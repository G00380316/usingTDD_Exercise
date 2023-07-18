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

         assertEquals(22,testCalculator.add(first,second));
        }

        @Test
        void testMultiply(){

            int first = 2;
            int second = 11;

            assertEquals(22,testCalculator.multiply(first,second));
        }

        @Test
        void testSubtract(){

            int first = 24;
            int second = 2;

            assertEquals(22,testCalculator.subtract(first,second));
        }

        @Test
        void testDivide(){

            int first = 44;
            int second = 2;

            assertEquals(22,testCalculator.divide(first,second));
        }
        @AfterEach
        void tearDown() {
        }
}