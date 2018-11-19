
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculate;

    @Before
    public void before(){
        calculate = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(10, calculate.add(5, 5));
    }

    @Test
    public void subtract(){
        assertEquals(10, calculate.subtract(15, 5));
    }

    @Test
    public void multiply(){
        assertEquals(20, calculate.multiply(10, 2));
    }

    @Test
    public void divide(){
        assertEquals(10, calculate.divide(100, 10));
    }
}




