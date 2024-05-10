package uz.pdp.firstspringpoject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
//    @Column(nullable = false,unique = true)
    private double salary;

    public Employee(String fullName, double salary){
        this.fullName = fullName;
        this.salary = salary;
    }
}
