package zhibek.example.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zhibek.example.studentmanagement.entities.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
