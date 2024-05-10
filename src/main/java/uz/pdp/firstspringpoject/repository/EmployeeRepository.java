package uz.pdp.firstspringpoject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.firstspringpoject.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
