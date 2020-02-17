package ie.gmit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private Calculator myCalculator;

    @BeforeAll
    public static void init()
    {
        System.out.println("Starting test");
    }

    @BeforeEach
    public void testStart(TestInfo testinfo, TestReporter testReporter)
    {
        testReporter.publishEntry("Testing " + testinfo.getDisplayName());
        myCalculator = new Calculator(2,2,0);
    }

    @AfterAll
    public static void testEnd(TestInfo testInfo, TestReporter testReporter)
    {
        testReporter.publishEntry("\033[34m " + testInfo.getDisplayName() + " finished\033[0m");
    }

    @DisplayName("Constructor test")
    @Test
    void testConstructor()
    {
        myCalculator = new Calculator();
        assertEquals(1, myCalculator.getCount());
    }

    @DisplayName("Parametric constructor test")
    @Test
    void testParametricConstructor()
    {
       myCalculator = new Calculator(1,1,0);
       assertEquals(1, myCalculator.getCount());
    }

    @DisplayName("Add test")
    @Test
    void testAdd()
    {
        assertEquals(4, myCalculator.add());
    }

    @DisplayName("Subtract test")
    @Test
    void testSubtract()
    {
        myCalculator = new Calculator(4, 5, 0);
        assertEquals(1, myCalculator.subtract());
    }

    @DisplayName("Multiply test")
    @Test
    void testMultiply()
    {
        assertEquals(4, myCalculator.multiply());
    }

    @DisplayName("Divide test")
    @Test
    void testDivide()
    {
        myCalculator = new Calculator(5, 0, 0);
        if(myCalculator.getValue2() == 0)
            assertThrows(ArithmeticException.class, ()-> myCalculator.divide());

        myCalculator = new Calculator(5,5,0);
            assertEquals(1, myCalculator.divide());
    }

    @DisplayName("Set Value1 test")
    @Test
    void testSetVal1()
    {
        myCalculator.setValue1(7);
        assertEquals(7, myCalculator.getValue1());
    }

    @DisplayName("Set Value2 test")
    @Test
    void testSetVal2()
    {
        myCalculator.setValue2(7);
        assertEquals(7, myCalculator.getValue2());
    }

    @DisplayName("Set Count test")
    @Test
    void testSetCount()
    {
        myCalculator.setCount(7);
        assertEquals(7, myCalculator.getCount());
    }

    @DisplayName("Set Result test")
    @Test
    void testSetResult()
    {
        myCalculator.setResult(7);
        assertEquals(7, myCalculator.getResult());
    }
}
