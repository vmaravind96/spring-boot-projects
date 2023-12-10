package com.project.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.student.model.Student;
import com.project.student.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementAppApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student s1 = new Student("Aravindakumar", "V M", "aravind@gmail.com");
//		studentRepository.save(s1);
//		
//		Student s2 = new Student("Tony", "Stark", "tony@gmail.com");
//		studentRepository.save(s2);
//		
//		Student s3 = new Student("Steve", "Rogers", "steve@gmail.com");
//		studentRepository.save(s3);
		
	}

}
