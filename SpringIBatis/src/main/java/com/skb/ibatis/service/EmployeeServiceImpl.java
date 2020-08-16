package com.skb.ibatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skb.ibatis.dao.EmployeeDao;
import com.skb.ibatis.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao empDao;
	
	@Override
	public Employee findEmpById(Integer id) {
		return empDao.findEmpById(id);
	}

	@Override
	public List<Employee> findEmpByDeptId(Integer id) {
		return empDao.findEmpByDeptId(id);
	}

	@Override
	public List<Employee> findEmpByEmpIdMgrId(Integer empid, Integer mgrid) {
		return empDao.findEmpByEmpIdMgrId(empid,mgrid);
	}

	@Override
	public void updateEmpSal(Employee emp) {
		empDao.updateEmpSal(emp);
	}

	@Override
	public void saveEmplyoee(Employee emp) {
		empDao.saveEmplyoee(emp);
	}

}
