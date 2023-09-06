import org.junit.Assert;
import org.junit.Test;
public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassString()
    {
        String a = getClassString();
        boolean contains = a.contains("hello");
        boolean contains1 = a.contains("Hello");

        if (contains | contains1 != true) {
            Assert.fail("There is no hello or Hello word");
        }
    }
}
