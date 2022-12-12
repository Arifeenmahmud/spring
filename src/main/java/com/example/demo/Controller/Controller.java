package com.example.demo.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.ModelEntity.StudentEntity;
import com.example.demo.Service.Service;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private Service service;
	
	@PostMapping("/saveStudent")
	public StudentEntity saveStudent(@RequestBody StudentEntity student) {
		return service.saveStudent(student);
	}
	
	@PostMapping("/saveAllStudent")
	public List<StudentEntity> saveAll(@RequestBody List<StudentEntity> students){
		return service.saveAll(students);
	}
	
	@GetMapping("/getAll")
	public List<StudentEntity> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getbyID/{id}")
	public StudentEntity getbyID(@PathVariable int id) {
		return service.getbyID(id);
		
	}
	
	@GetMapping("/getbyName/{name}")
	public StudentEntity getbyName(@PathVariable String name) {
		return service.getbyName(name);		
	}
	
	
  @PutMapping("/updateStudent")
  public StudentEntity updateStudent(@RequestBody StudentEntity student) {
	  
	  return service.updateStudent(student);
  }
  
  @DeleteMapping("/delete/{id}")
  public String delete(@PathVariable int id) {
	  return service.delete(id);
  }
  
  @PostMapping("/fileUpload")

  public String uploadFile(@RequestParam("file") MultipartFile file) throws IOException {

	  return service.uploadFile(file);
  }
  
	
	
	

}
