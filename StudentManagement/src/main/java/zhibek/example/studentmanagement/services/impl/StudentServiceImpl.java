package zhibek.example.studentmanagement.services.impl;

import org.springframework.stereotype.Service;
import zhibek.example.studentmanagement.entities.Student;
import zhibek.example.studentmanagement.repositories.StudentRepo;
import zhibek.example.studentmanagement.services.StudentService;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        super();
        this.studentRepo = studentRepo;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
    @Override
    public Student getStudentById(Long id){
        return studentRepo.findById(id).get();
    }
    @Override
    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }
}
