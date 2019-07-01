package com.edujivika.service;

import java.util.Optional;

import com.edujivika.model.StudyMaterial;

public interface StudyMaterialService {

	public Iterable<StudyMaterial> findAll();

	public StudyMaterial save(StudyMaterial student);

	public Optional<StudyMaterial> findByID(String id);

	public void removeStudyMaterial(String id);

}
