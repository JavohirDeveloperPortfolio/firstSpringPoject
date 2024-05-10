package uz.pdp.firstspringpoject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.firstspringpoject.model.Employee;
import uz.pdp.firstspringpoject.model.dto.EmployeeDto;
import uz.pdp.firstspringpoject.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping
    public Employee saveEmployee(@RequestBody EmployeeDto dto){
        return employeeRepository.save(
                new Employee(
                        dto.getFullName(),
                        dto.getSalary()));
    }
}
