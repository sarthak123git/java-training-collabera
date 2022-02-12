package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}