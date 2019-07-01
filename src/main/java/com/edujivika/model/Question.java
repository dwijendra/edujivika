package com.edujivika.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Question {
	public static class Answer {
		private String ans;
		private String nextDocId;
		private String nextDocType;

		public Answer() {

		}

		public Answer(String ans, String nextDocId) {
			this.ans = ans;
			this.nextDocId = nextDocId;
		}

		public String getAns() {
			return ans;
		}

		public void setAns(String ans) {
			this.ans = ans;
		}

		public String getNextDocId() {
			return nextDocId;
		}

		public void setNextDocId(String nextDocId) {
			this.nextDocId = nextDocId;
		}
	}

	@Id
	private String id;
	private String type = "Question";
	private String question;
	private Answer[] answers;

	public Question() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer[] getAnswers() {
		return answers;
	}

	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}

}
