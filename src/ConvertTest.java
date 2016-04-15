import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kyletang on 4/6/16.
 */
public class ConvertTest {
    Convert ninty = Convert.createobject(90);

    @Test
    public void inchToyard() throws Exception {
        Assert.assertEquals(90.0/36,ninty.inchToyard(),0);
    }

    @Test
    public void inchTofeet() throws Exception {
        Assert.assertEquals(90.0/12,ninty.inchTofeet(),0);
    }

    @Test
    public void feetToyard() throws Exception {
        Assert.assertEquals(90.0/3,ninty.feetToyard(),0);
    }

    @Test
    public void feetToinch() throws Exception {
        Assert.assertEquals(90.0*12,ninty.feetToinch(),0);
    }

    @Test
    public void yardToinch() throws Exception {
        Assert.assertEquals(90.0*36,ninty.yardToinch(),0);
    }

    @Test
    public void yardTofeet() throws Exception {
        Assert.assertEquals(90.0*3,ninty.yardTofeet(),0);
    }

}