package com.example.demo.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.ModelEntity.StudentEntity;
import com.example.demo.Repository.Repository;
import org.springframework.web.multipart.MultipartFile;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	private Repository repository;
	
	public StudentEntity saveStudent(StudentEntity student) {
		return repository.save(student);
	}
	
	
	public List<StudentEntity> saveAll( @RequestBody List<StudentEntity> students) {
		return repository.saveAll(students);
		
	}
	
	public List<StudentEntity> getAll() {
		return repository.findAll();
	}
	
	public StudentEntity getbyID(int id) {
		return repository.findById(id).orElse(null);
		
	}
	public StudentEntity getbyName(String name) {
		return repository.findByName(name);
		
	}
	
	public StudentEntity updateStudent(StudentEntity student) {
		StudentEntity exStudent = repository.findById(student.getId()).orElse(null);
		exStudent.setName(student.getName());
		exStudent.setAge(student.getAge());
		exStudent.setAddress(student.getAddress());
		exStudent.setCourse(student.getCourse());
		exStudent.setMarkspdf(student.getMarkspdf());
		return repository.save(student);
	}
	
	public String delete(int id) {
		repository.deleteById(id);
		return "Id Delete";
	}

	public String uploadFile(MultipartFile file) throws IOException {
		file.transferTo(new File("N:\\File\\" + file.getOriginalFilename()));

		StudentEntity fileUpload = new StudentEntity();
		fileUpload.setMarkspdf("N:\\File\\" + file.getOriginalFilename());
		repository.save(fileUpload);
		return ("Have done succesfully Uploaded" +file.getOriginalFilename());



	}

}
