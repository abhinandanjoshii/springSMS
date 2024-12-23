package com.consoleadmin.SpringJDBC;

import com.consoleadmin.SpringJDBC.model.Student;
import com.consoleadmin.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		Student s =  new Student();
		s.setRollNo(104);
		s.setName("Abhi");
		s.setMarks(98);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);
dasdasadsda
		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
