import org.junit.Assert;
import org.junit.Test;

public class DemoTestRevser {
	@Test
	public void revser()
	{
		int number=140;
		int result=041;
		ReverseNumber s=new ReverseNumber();
		int findRevserNumber=s.reverseNumber(number);
		Assert.assertEquals(result, findRevserNumber);
	}

}
