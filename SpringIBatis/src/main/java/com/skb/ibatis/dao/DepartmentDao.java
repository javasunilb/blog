package com.skb.ibatis.dao;

import java.util.List;

import com.skb.ibatis.dto.Department;

public interface DepartmentDao {

	List<Department> findByAll();

}
