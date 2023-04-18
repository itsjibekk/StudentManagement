package zhibek.example.studentmanagement.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;

    public Student() {
    }

    public Student(String firstName, String lastName, String email) {
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
    }
}
