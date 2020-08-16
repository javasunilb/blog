package com.skb.ibatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skb.ibatis.dto.Employee;
import com.skb.ibatis.mapper.EmployeeMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeMapper empMapper;
	
	@Override
	public Employee findEmpById(Integer id) {
		return empMapper.findEmpById(id);
	}

	@Override
	public List<Employee> findEmpByDeptId(Integer id) {
		return empMapper.findEmpByDeptId(id);
	}

	@Override
	public List<Employee> findEmpByEmpIdMgrId(Integer empid, Integer mgrid) {
		return empMapper.findEmpByEmpIdMgrId(empid,mgrid);
	}

	@Override
	public void updateEmpSal(Employee emp) {
		empMapper.updateEmpSal(emp);	
	}

	@Override
	public void saveEmplyoee(Employee emp) {
		empMapper.saveEmployee(emp);
	}

}
