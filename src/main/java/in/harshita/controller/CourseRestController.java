package in.harshita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.harshita.binding.CourseBinding;
import in.harshita.service.CourseService;

@RestController
public class CourseRestController {
	@Autowired
	private CourseService service;
	
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody CourseBinding c){
		String status = service.upsurt(c);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/course/{id}")
	public ResponseEntity<CourseBinding> getCourse(@PathVariable Integer id) {
		CourseBinding c = service.getById(id);
		return new ResponseEntity<>(c, HttpStatus.OK);		
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<CourseBinding>> getAllCourse(){
		List<CourseBinding> cb = service.getAllById();
		return new ResponseEntity<>(cb,HttpStatus.OK);
	}
	
	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		String status = service.deleteById(id);
		return new ResponseEntity<>(status,HttpStatus.OK);
	}
}
