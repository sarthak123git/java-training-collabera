import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
public class StringContainsTest {
	 @Test
	    public void testcontainsString(){  // litter slow
	        assertThat("tbarua1@gmail.com",containsString("@gmail.com"));
	    }
	    @Test
	    public void testendsWith(){ // fastest approach
	        assertThat("tbarua1@gmail.com",endsWith("@unihut.com"));
	    }
	    @Test
	    public void testbeginsWith(){ // fastest approach
	        assertThat("tbarua1@gmail.com",startsWith("@unihut.com"));
	    }
}
