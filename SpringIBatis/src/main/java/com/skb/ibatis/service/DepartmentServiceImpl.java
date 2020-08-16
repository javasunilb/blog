package com.skb.ibatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skb.ibatis.dao.DepartmentDao;
import com.skb.ibatis.dto.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentDao deptDao;
	
	@Override
	public List<Department> findByAll() {
		return deptDao.findByAll();
	}

}
