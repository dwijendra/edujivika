package com.edujivika.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.edujivika.model.Question;

public interface QuestionRepository extends MongoRepository<Question, String> {

}
