package com.javatech.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatech.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
