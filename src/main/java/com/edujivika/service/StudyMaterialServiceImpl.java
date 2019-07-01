package com.edujivika.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edujivika.model.StudyMaterial;
import com.edujivika.repository.StudyMaterialRepository;

@Service("v1")
public class StudyMaterialServiceImpl implements StudyMaterialService {

	@Autowired
	StudyMaterialRepository studyMaterialRepository;

	@Override
	public Iterable<StudyMaterial> findAll() {
		return studyMaterialRepository.findAll();
	}

	@Override
	public StudyMaterial save(StudyMaterial sm) {
		return studyMaterialRepository.save(sm);
	}

	@Override
	public Optional<StudyMaterial> findByID(String id) {
		return studyMaterialRepository.findById(id);
	}

	@Override
	public void removeStudyMaterial(String id) {
		StudyMaterial sm = new StudyMaterial();
		sm.setId(id);
		studyMaterialRepository.delete(sm);
	}

}
