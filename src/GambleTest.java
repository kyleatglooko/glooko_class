import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kyletang on 4/1/16.
 */
public class GambleTest {

    Gamble task1 = Gamble.createobject(0.3,0.5);



    @Test
    public void testNotA() throws Exception {
        Assert.assertEquals(0.7,task1.notA(),0);

    }

    @Test
    public void testBothAB() throws Exception {
        Assert.assertEquals(0.15,task1.bothAB(),0);
    }

    @Test
    public void testAorB() throws Exception {
        Assert.assertEquals(0.65, task1.AorB(),0);

    }
}