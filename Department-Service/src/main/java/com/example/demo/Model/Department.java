package com.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	@Id
	private String id;
	private String dName;
	private String dAddress;
	private String dCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public String getdCode() {
		return dCode;
	}

	public void setdCode(String dCode) {
		this.dCode = dCode;
	}

}
