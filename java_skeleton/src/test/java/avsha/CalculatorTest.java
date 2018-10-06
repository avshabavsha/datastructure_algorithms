package avsha;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


public class CalculatorTest {
    @Test
    public void verifyAdd(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
        assertThat(calculator.getLastResult(), is(3));
    }

}