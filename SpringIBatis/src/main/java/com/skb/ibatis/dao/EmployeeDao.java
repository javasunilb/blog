package com.skb.ibatis.dao;

import java.util.List;

import com.skb.ibatis.dto.Employee;

public interface EmployeeDao {
	Employee findEmpById(Integer id);

	List<Employee> findEmpByDeptId(Integer id);

	List<Employee> findEmpByEmpIdMgrId(Integer empid, Integer mgrid);

	void updateEmpSal(Employee emp);

	void saveEmplyoee(Employee emp);
}
