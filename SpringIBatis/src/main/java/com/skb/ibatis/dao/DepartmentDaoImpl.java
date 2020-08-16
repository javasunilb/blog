package com.skb.ibatis.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skb.ibatis.dto.Department;
import com.skb.ibatis.mapper.DepartmentMapper;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private DepartmentMapper deptMapper;

	@Override
	public List<Department> findByAll() {
		return deptMapper.findByAll();
	}
}
