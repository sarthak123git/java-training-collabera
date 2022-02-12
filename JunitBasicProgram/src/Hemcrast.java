import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Test;

public class Hemcrast {
	  @Test
	    public void testEmailID(){  // JUnit Test case
	        String email="tbarua1@gmail.com";
	        Assert.assertTrue(email.contains("@"));
	    }
	    @Test
	    public void testEmailIDHamcrest(){  // Hamcrest Test case
	        String email="tbarua1@gmail.com";
	        Assert.assertThat(email, StringContains.containsString("gmail.com"));
	    }
}
