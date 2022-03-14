import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterMelonTest {
    @Test
    public void Assignment1Test(){
        WaterMelon x= new WaterMelon();
        assertEquals("YES",x.Even(8));
        assertEquals("NO",x.Even(5));
        assertEquals("YES",x.Even(4));
        assertEquals("NO",x.Even(3));
        assertEquals("NO",x.Even(2));
        assertEquals("NO",x.Even(1));
        assertEquals("NO",x.Even(7));
        assertEquals("YES",x.Even(6));
        assertEquals("YES",x.Even(10));
        assertEquals("NO",x.Even(9));
        assertEquals("NO",x.Even(53));
        assertEquals("NO",x.Even(77));
        assertEquals("YES",x.Even(32));
        assertEquals("YES",x.Even(44));
        assertEquals("YES",x.Even(98));
        assertEquals("NO",x.Even(99));
        assertEquals("YES",x.Even(90));
        assertEquals("NO",x.Even(67));
        assertEquals("YES",x.Even(100));
        assertEquals("YES",x.Even(88));
    }

}