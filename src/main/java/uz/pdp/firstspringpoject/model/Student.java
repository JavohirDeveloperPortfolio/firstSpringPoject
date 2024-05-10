package uz.pdp.firstspringpoject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "students")
public class Student {
    @Id
    private Integer id;
    private String fullName;
    private String phoneNumber;
}
