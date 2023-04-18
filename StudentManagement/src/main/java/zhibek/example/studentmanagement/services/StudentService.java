package zhibek.example.studentmanagement.services;

import zhibek.example.studentmanagement.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);
    Student updateStudent(Student student);
}
