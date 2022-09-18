package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Passport {
@Id
	private int id;
	private String number;
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
}


