package in.ineuron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.Student;
@CrossOrigin
@RestController

public class controller {
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTouristDetails() {
		
	
		Student student=new Student();
		student.setAge(21);
		student.setFirstname("nitin");
		student.setLastname("vanga");
		student.setProfession("java developer");
		System.out.println(student);
		
			return new ResponseEntity<Student>(student, HttpStatus.OK);
		}
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Student student) {

		System.out.println(student);
		return new ResponseEntity<String>("student registered succesfully", HttpStatus.OK);

	}

}
