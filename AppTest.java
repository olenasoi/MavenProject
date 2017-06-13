package co.edu.uniandes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest 
{
    @Test
    public void testMethod1() {
        System.out.println( "Hello World Test!" );
    }

    @Test
    public void testMethod2() {

        Assert.assertEquals(2,2);
    }
}
