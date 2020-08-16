package com.skb.ibatis.mapper;

import org.apache.ibatis.jdbc.SQL;

public class EmployeeProvider {
	//If you don't use parameter here
	public static String findEmpByDeptId1() {
		return new SQL() {{
			SELECT("*");
			FROM("emp");
			WHERE("deptno=#{deptid}");
		}}.toString();
	}
	
	//The parameter same as mapper
	public static String findEmpByDeptId2(Integer id) {
		String sql = new SQL() {{
			SELECT("*");
			FROM("emp");
			WHERE("deptno=#{id}");
		}}.toString();
		System.out.println("@findEmpByDeptId2 Query sql :" + sql);
		return sql;
	}
}
