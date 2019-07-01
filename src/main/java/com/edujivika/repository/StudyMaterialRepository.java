package com.edujivika.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.edujivika.model.StudyMaterial;

public interface StudyMaterialRepository extends MongoRepository<StudyMaterial, String> {


}
