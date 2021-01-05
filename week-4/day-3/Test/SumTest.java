import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    Sum getSum;

    @Before
    public void setup() {
        getSum = new Sum();
    }

    @Test
    public void SumTest(){
        Sum sum = new Sum();
        assertEquals(getSum, 55 );

    }

}