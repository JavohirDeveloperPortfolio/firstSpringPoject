package uz.pdp.firstspringpoject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    private Long id;
    private String name;
    @Column(name = "phone_number",unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String subject;
    private int age;
    private int experience;
    private String gender;
}
