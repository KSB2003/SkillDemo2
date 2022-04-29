import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class SkillDemoTest {

    @Test
    public void TestMultiply(){
        assertEquals(6, SkillDemo.multiply(2, 3));
    }    
}
