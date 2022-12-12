package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.ModelEntity.StudentEntity;

public interface Repository extends JpaRepository<StudentEntity, Integer> {

	StudentEntity findByName(String name);

}
