import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Before
    public void beforeTest(){
        System.out.println("Antes del test");
    }

    @Test
    public void testGetHello(){
        System.out.println("Durante el test");
        assertEquals("Hello mundito", new Hello().getHello());
    }

    @After
    public void AfterTest(){
        System.out.println("Despues del test");
    }
}
