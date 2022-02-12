import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTestCode {
	 int x=0;
	    int y=0;
	    int result=0;
	    Calculator calculator =null;
	    @BeforeClass
	    public void setupClassLevel(){
	        System.out.println("Invoke before loading class in JVM");
	    }
	    @Before
	    public void setup(){
	         x=30;
	         y=20;
	        calculator =new Calculator();
	    }
	    @Test
	    public void addtionTest(){
	        result=50;
	        int finalResult=calculator.addition(x,y);
	        Assert.assertEquals(result, finalResult);
	    }
	    @Test
	    public void subtractionTest(){
	        result=10;
	        int finalResult=calculator.subtraction(x,y);
	        Assert.assertEquals(result, finalResult);
	    }
	    @After
	    public void cleaning(){
	        x=0;
	        y=0;
	        calculator =null;
	    }
	    @AfterClass
	    public void setupAfterClassLevel(){
	        System.out.println("Invoke After class loading class in JVM");
	    }
}
