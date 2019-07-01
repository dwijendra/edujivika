package com.edujivika.model;

import org.springframework.data.annotation.Id;

public class StudyMaterial {
	@Id
	private String id;
	private String header;
	private String type = "SM";
	private String desc;
	private String nextDocId;
	private String nextDocType;

	public String getNextDocType() {
		return nextDocType;
	}

	public void setNextDocType(String nextDocType) {
		this.nextDocType = nextDocType;
	}

	public String getNextDocId() {
		return nextDocId;
	}

	public void setNextDocId(String nextDocId) {
		this.nextDocId = nextDocId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

}
