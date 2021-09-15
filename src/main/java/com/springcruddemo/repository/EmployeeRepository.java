package com.springcruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcruddemo.model.Employee;

@Repository
	public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	}

//By extending JpaRepository, we can access CRUD operations easily