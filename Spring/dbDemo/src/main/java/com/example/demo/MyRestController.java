package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyRestController {
	
	@Autowired
	EmpDBDao dao;
	
	@GetMapping(path="/employees",produces="application/xml")
	public List<Employee> getEmployees() {
		
		return dao.findAll();
	}

	
	@GetMapping("/employees/{eid}")
	public Optional<Employee> getEmployees(@PathVariable("eid") int eid) {
		System.out.println("emp id :" +eid);
		return dao.findById(eid);
	}
	
	/*
	 * @PostMapping("/employee") public String insertEmp(@RequestBody Employee emp)
	 * { dao.save(emp); return "success"; }
	 */
	
	
	@PostMapping("/employee")
	public String insertEmp(@RequestBody Employee emp) {
		if(dao.existsById(emp.getEid()))
		return "already exists";
		else
			dao.save(emp);
		return "success";
	}
	
	
	@PutMapping("/employee")
	public String insertputEmp(@RequestBody Employee emp) {
		if(dao.existsById(emp.getEid()))
		return "already exists";
		else
			dao.save(emp);
		return "success";
	}
	
	@DeleteMapping("/employees/{eid}")
	public String removeEmployees(@PathVariable("eid") int eid) {
		System.out.println("emp id :" +eid);
	     dao.deleteById(eid);
	     return "deleted succesfully";
	}


}