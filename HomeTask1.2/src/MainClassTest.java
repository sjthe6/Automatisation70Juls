import org.junit.Assert;
import org.junit.Test;
public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int a = getClassNumber();

        if (a < 45) {
            Assert.fail("Number is less than 45");
        }
    }

}
