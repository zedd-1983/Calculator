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
        myCalculator = new Calculator();
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
        assertEquals(0, myCalculator.getCount());
    }

    @DisplayName("Parametric constructor test")
    @Test
    void testParametricConstructor()
    {
       myCalculator = new Calculator(1,1,0);
       assertEquals(0, myCalculator.getCount());
    }

    @DisplayName("Add test")
    @Test
    void testAdd()
    {
        assertEquals(10, myCalculator.add(5,5));
    }

    @DisplayName("Subtract test")
    @Test
    void testSubtract()
    {
        assertEquals(0, myCalculator.subtract(5,5));
    }

    @DisplayName("Multiply test")
    @Test
    void testMultiply()
    {
        assertEquals(25, myCalculator.multiply(5,5));
    }

    @DisplayName("Divide test")
    @Test
    void testDivide()
    {
        assertEquals(1, myCalculator.divide(5,5));
    }


}
