import org.junit.Test;
import org.junit.Assert;
public class DemoTest {
    @Test
    public void TestSay(){
        Demo demo = new Demo();
        String result = demo.Say("maven");
        Assert.assertEquals("hello maven", result);

    }
}
