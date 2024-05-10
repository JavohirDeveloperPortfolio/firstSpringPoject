package uz.pdp.firstspringpoject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.firstspringpoject.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
