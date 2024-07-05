import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    private Factorial factorial;
    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void printFactorialPositive() {
        long result = factorial.printFactorial(3);
        assertEquals(6, result);
    }
    @Test
    public void printFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> factorial.printFactorial(-1));
    }
}
