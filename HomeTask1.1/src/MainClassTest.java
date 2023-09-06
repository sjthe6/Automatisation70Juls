import org.junit.Assert;
import org.junit.Test;
public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        if (getLocalNumber() != 14) {
            Assert.fail("Error. It should be 14.");
        }
    }
}
