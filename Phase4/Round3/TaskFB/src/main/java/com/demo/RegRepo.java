package com.demo;

import com.demo.Reg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegRepo extends JpaRepository<Reg, String>{
	@Query("select u from Reg u where u.username=?1")
	public Reg findByName(String name);
	
	@Query("select u from Reg u where u.password=?1")
	public Reg findBypassword(String name);
}
