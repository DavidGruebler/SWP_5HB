package generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Pair2_unitTest {
	
	@Test
    void testSwap() {
        Pair2<String, Integer> pair = new Pair2<>("Test", 123);
        Pair2<Integer, String> swappedPair = pair.swap();
        Assert.assertEquals(swappedPair, 123, "Test");
        
        
     
    }
}
