package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegDAO {
	@Autowired 
	RegRepo repo;
	  

	public Reg insert(Reg r) {
		return repo.save(r);
}
}