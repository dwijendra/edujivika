package com.edujivika.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edujivika.model.Question;
import com.edujivika.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	QuestionService questionService;


	@RequestMapping(value = "/question", method = RequestMethod.GET)
	public Iterable<Question> studentV1() {
		return questionService.findAll();
	}

		
	@RequestMapping(value = "/question/create", method = RequestMethod.POST)
	public Question createStudent(@RequestBody()Question que) {
		return questionService.save(que);
	}
	
}
