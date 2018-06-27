import org.junit.Test;
//import org.junit.ignore;
import static org.junit.Assert.assertEquals;
//import static junit.



public class Testing {

   blackJack blackJa = new blackJack();

    @Test
    public void testBlackJack()
    {


        assertEquals(20, blackJa.blackJackMethod(20,15));
        assertEquals(18, blackJa.blackJackMethod(18, 10));

    }
}
