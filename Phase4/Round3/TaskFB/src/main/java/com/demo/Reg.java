package com.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.demo.Reg;

import lombok.Data;
@Entity
@Data
public class Reg {
	@Id
	private String username;
	private String password;
	private String email;
}
