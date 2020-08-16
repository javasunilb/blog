package com.skb.ibatis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skb.ibatis.dto.Department;
import com.skb.ibatis.service.DepartmentService;

@RestController
public class DepartmentRest {
	
	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/findByAll")
	List<Department> findByAll(){
		return deptService.findByAll();
	}
	
}
