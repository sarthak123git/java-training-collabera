package mockingDemo1;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

	public class mockitoDemo {
	    EmployeeService employeeService;
	    @Before
	    public void setUp() {
	        employeeService = Mockito.mock(EmployeeService.class);
	        EmployeeManager employeeManager = new EmployeeManager();
	        employeeManager.setEmployeeService(employeeService);
	    }
	    }
	
