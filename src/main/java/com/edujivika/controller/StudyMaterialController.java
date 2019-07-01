package com.edujivika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edujivika.model.StudyMaterial;
import com.edujivika.service.StudyMaterialService;

@RestController
public class StudyMaterialController {

	@Autowired
	StudyMaterialService studyMaterialService;

	@RequestMapping(value = "/sm", method = RequestMethod.GET)
	public Iterable<StudyMaterial> studentV1() {
		return studyMaterialService.findAll();
	}

	@RequestMapping(value = "/sm/create", method = RequestMethod.POST)
	public StudyMaterial createStudent(@RequestBody() StudyMaterial sm) {
		return studyMaterialService.save(sm);
	}

}
