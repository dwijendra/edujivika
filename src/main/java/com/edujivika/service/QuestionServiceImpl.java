package com.edujivika.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edujivika.model.Question;
import com.edujivika.repository.QuestionRepository;

@Service("vx")
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public Iterable<Question> findAll() {
		return questionRepository.findAll();
	}

	@Override
	public Question save(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> findByID(String id) {
		return questionRepository.findById(id);
	}

	@Override
	public void removeQuestion(String id) {
		Question st = new Question();
		st.setId(id);
		questionRepository.delete(st);

	}

}
