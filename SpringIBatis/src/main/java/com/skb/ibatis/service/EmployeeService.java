package com.skb.ibatis.service;

import java.util.List;

import com.skb.ibatis.dto.Employee;

public interface EmployeeService {
	Employee findEmpById(Integer id);

	List<Employee> findEmpByDeptId(Integer id);

	List<Employee> findEmpByEmpIdMgrId(Integer empid, Integer mgrid);

	void updateEmpSal(Employee emp);

	void saveEmplyoee(Employee emp);
}
