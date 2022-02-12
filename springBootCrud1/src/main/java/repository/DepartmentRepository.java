package repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import entity.Department;
	 
	// Annotation
	@Repository
	 
	// Interface
	public interface DepartmentRepository
	    extends JpaRepository<Department, Long> {
	}

