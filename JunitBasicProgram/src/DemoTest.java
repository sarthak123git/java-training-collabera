import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
   @Test
	public void findbyGreatest()
	{
		int a=6;
		int b=7;
		int c=8;
		int result=6;
		Greatest s=new Greatest();
		int findResult=s.greatest(a, b, c);
		Assert.assertEquals(result, findResult);
		
	}
}
