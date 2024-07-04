import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FactorialTest {
    @Test
    public void printFactorial() {
        Factorial factorial = new Factorial();
        long result = factorial.printFactorial(3);
        assertEquals(6, result);
    }
}
