import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;


import org.hamcrest.core.IsEqual;
public class hemcrest {
	
	 @Test
	    public void testcontainsString(){
	        assertThat("tbarua1@gmail.com",containsString("@gmail.com"));
	    }
	    @Test
	    public void testendsWith(){
	        assertThat("tbarua1@gmail.com",endsWith("@unihut.com"));
	    }
	   // @Test
//	    public void equlToDemo()
//	    {
//	    	assertThat();
//	    }
}
