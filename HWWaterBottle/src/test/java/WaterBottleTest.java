import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink(){
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.empty());
    }

    @Test
    public void canFill(){
        bottle.fill();
        assertEquals(100, bottle.fill());
    }

}
