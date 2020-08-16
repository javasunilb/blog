package com.skb.ibatis.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skb.ibatis.dto.Employee;
import com.skb.ibatis.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeRest {
	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping(value = "findEmpById")
	public Employee findEmpById(@RequestParam("id")Integer id) {
		return empService.findEmpById(id);
	}
	
	@GetMapping(value = "findEmpByDeptId")
	public List<Employee> findEmpByDeptId(@RequestParam("id")Integer id) {
		return empService.findEmpByDeptId(id);
	}
	
	@GetMapping(value = "findEmpByEmpIdMgrId")
	public List<Employee> findEmpByEmpIdMgrId(@RequestParam("empid")Integer empid,@RequestParam("mgrid")Integer mgrid) {
		return empService.findEmpByEmpIdMgrId(empid,mgrid);
	}

	@PostMapping(value="updateEmpSal",produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateEmpSal(@RequestBody Employee emp) {
		try {
			empService.updateEmpSal(emp);
			return "success";
		}catch(Exception e) {
			e.printStackTrace();
			return "Failed";
		}
	}
	
	@PostMapping(value="saveEmpSal")
	public Employee saveEmplyoee(@RequestBody Employee emp) {
		empService.saveEmplyoee(emp);
		return emp;
	}
}
