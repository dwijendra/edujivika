package com.edujivika.service;

import java.util.Optional;

import com.edujivika.model.Question;

public interface QuestionService {
	public Iterable<Question> findAll();

	public Question save(Question question);

	public Optional<Question> findByID(String id);

	public void removeQuestion(String id);

}
