package com.springCrud;

	import java.util.List;
	// Importing required classes
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

	 
	@RestController
	 
	public class DepartmentController {
	 
	    // Annotation
	    @Autowired 
	    private DepartmentService departmentService;
	    
	    @GetMapping("/hello")
	    public String greeting() {
	    	return "hello world";
	    }
	    // Save operation
	    @PostMapping("/departments")
	    public Department saveDepartment(
	    		@RequestBody Department department)
	    {
	        return departmentService.saveDepartment(department);
	    }
	 
	    // Read operation
	    @GetMapping("/departments")
	    public List<Department> fetchDepartmentList()
	    {
	        return departmentService.fetchDepartmentList();
	    }
	 
	    // Update operation
	    @PutMapping("/departments/{id}")
	    public Department
	    updateDepartment(@RequestBody Department department,
	                     @PathVariable("id") Long departmentId)
	    {
	        return departmentService.updateDepartment(
	            department, departmentId);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/departments/{id}")
	    public String deleteDepartmentById(@PathVariable("id")
	                                       Long departmentId)
	    {
	        departmentService.deleteDepartmentById(
	            departmentId);
	        return "Deleted Successfully";
	    }
	}
