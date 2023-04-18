package zhibek.example.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zhibek.example.studentmanagement.entities.Student;
import zhibek.example.studentmanagement.repositories.StudentRepo;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}
    @Autowired
	private StudentRepo studentRepo;
	@Override
	public void run(String... args) throws Exception {
		/*Student student1 = new Student("Ramesh","Orozmamtova","itsjibekk@gmail.com");
		studentRepo.save(student1);
		Student student2 = new Student("Zhibek","Orozmamtova","itsjibekk@gmail.com");
		studentRepo.save(student2);
		Student student3 = new Student("Nureles","Orozmamtova","itsjibekk@gmail.com");
		studentRepo.save(student3);*/
	}
}