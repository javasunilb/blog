package com.skb.ibatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.skb.ibatis.dto.Department;

public interface DepartmentMapper {

	@Select("select * from dept where deptno=#{id}")
	Department findDeptById(Integer id);

	@Select("select * from dept")
	@Results(id = "deptResult",value = {
			@Result(property = "deptno",id=true,column = "deptno"),
			@Result(property = "emps",column = "deptno",
					many = @Many(select = "com.skb.ibatis.mapper.EmployeeMapper.findEmpByDeptId"))
	})
	List<Department> findByAll();

}
