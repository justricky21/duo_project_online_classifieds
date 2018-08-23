import models.Advert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvertTest {
    Advert advert;

    @Before
    public void before(){
        advert = new Advert("Awesome Guitar, used by Hendrix", "Awesome guitar that Hendrix destroyed during his 1974 concert, restored to functionality", "Instruments", 10000, "Pick-up");
    }

    @Test
    public void hasTitle(){
        assertEquals("Awesome Guitar, used by Hendrix", advert.getTitle());
    }

    @Test
    public void hasDescription(){
        assertEquals("Awesome guitar that Hendrix destroyed during his 1974 concert, restored to functionality", advert.getDescription());
    }

    @Test
    public void hasCategory(){
        assertEquals("Instruments", advert.getCategory());
    }

    @Test
    public void hasAskingPrice(){
        assertEquals(10000, advert.getAskingPrice());
    }

    @Test
    public void hasDeliveryOption(){
        assertEquals("Pick-up", advert.getDeliveryOption());
    }

    @Test
    public void canSetTitle(){
        advert.setTitle("Something");
        assertEquals("Something", advert.getTitle());
    }

    @Test
    public void canSetDescription(){
        advert.setDescription("Something");
        assertEquals("Something", advert.getDescription());
    }

    @Test
    public void canSetCategory(){
        advert.setCategory("Something");
        assertEquals("Something", advert.getCategory());
    }

    @Test
    public void canSetAskingPrice(){
        advert.setAskingPrice(1);
        assertEquals(1, advert.getAskingPrice());
    }

    @Test
    public void canSetDeliveryOption(){
        advert.setDeliveryOption("Something");
        assertEquals("Something", advert.getDeliveryOption());
    }




}
