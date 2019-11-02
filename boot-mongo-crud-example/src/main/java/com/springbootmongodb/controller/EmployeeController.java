	package com.springbootmongodb.controller;
	
	import java.util.List;

//import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmongodb.DAO.EmployeeDao;
import com.springbootmongodb.bootmongocrudexample.EmployeeBean;
	
	@RestController
	@RequestMapping(value="/employee")
	public class EmployeeController {
	
		
		private final Logger logger = LoggerFactory.getLogger(this.getClass());
		
		@Autowired
		private EmployeeDao dao;
		
		@PostMapping(value="/create")
		public void createEmployee(@RequestBody List<EmployeeBean> emp)
		{
			System.out.println(emp.toString());
			dao.saveAll(emp);
		}
		
		@GetMapping(value="/getall")
		public List<EmployeeBean> getEmployee()
		{
			System.out.println(new EmployeeBean(1,"Gaurav","Developer").toString());
			logger.debug("getting all employees");
			
			return dao.findAll();
		}
	}
