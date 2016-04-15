import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by kyletang on 4/1/16.
 */
public class rectangleTest{


    rectangle rect3by5 = rectangle.createrectangle(3,5);
    rectangle square6 = rectangle.createsquare(6);


    @Test
    public void testGetArea() throws Exception {


        Assert.assertEquals(15,rect3by5.getArea(),0);
        Assert.assertEquals(36,square6.getArea(),0);

    }

    @Test
    public void testGetPerimeter() throws Exception {

        Assert.assertEquals(16,rect3by5.getPerimeter(),0);
        Assert.assertEquals(24,square6.getPerimeter(),0);

    }
}