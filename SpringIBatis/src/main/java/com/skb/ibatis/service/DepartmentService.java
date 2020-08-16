package com.skb.ibatis.service;

import java.util.List;

import com.skb.ibatis.dto.Department;

public interface DepartmentService {

	List<Department> findByAll();
}
