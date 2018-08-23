import models.Advert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvertTest {
    private Advert advert;

    @Before
    public void before(){
        advert = new Advert("Awesome Guitar, used by Hendrix", "Awesome guitar that Hendrix destroyed during his 1974 concert, restored to functionality", "Instruments", 10000, "Pick-up");
    }

    @Test
    public void advertHasTitle(){
        assertEquals("Awesome Guitar, used by Hendrix", advert.getTitle());
    }

    @Test
    public void advertHasDescription(){
        assertEquals("Awesome guitar that Hendrix destroyed during his 1974 concert, restored to functionality", advert.getDescription());
    }

    @Test
    public void advertHasCategory(){
        assertEquals("Instruments", advert.getCategory());
    }

    @Test
    public void advertHasAskingPrice(){
        assertEquals(10000, advert.getAskingPrice());
    }

    @Test
    public void advertHasDeliveryOption(){
        assertEquals("Pick-up", advert.getDeliveryOption());
    }

    @Test
    public void advertCanSetTitle(){
        advert.setTitle("Something");
        assertEquals("Something", advert.getTitle());
    }

    @Test
    public void advertCanSetDescription(){
        advert.setDescription("Something");
        assertEquals("Something", advert.getDescription());
    }

    @Test
    public void advertCanSetCategory(){
        advert.setCategory("Something");
        assertEquals("Something", advert.getCategory());
    }

    @Test
    public void advertCanSetAskingPrice(){
        advert.setAskingPrice(1);
        assertEquals(1, advert.getAskingPrice());
    }

    @Test
    public void advertCanSetDeliveryOption(){
        advert.setDeliveryOption("Something");
        assertEquals("Something", advert.getDeliveryOption());
    }




}
