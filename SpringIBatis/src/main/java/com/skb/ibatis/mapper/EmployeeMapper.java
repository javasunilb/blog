package com.skb.ibatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;

import com.skb.ibatis.dto.Employee;

public interface EmployeeMapper {

	public static final String EMP_RESULT = "empResult";
	
	@Select("select * from emp where empno=#{id}")
	@Results(id = EMP_RESULT,value={
		@Result(id=true,property="empno",column="empno"),
		@Result(property = "sal",column = "sal"),
		@Result(property="hiredate",column="hiredate",javaType = String.class,jdbcType = JdbcType.DATE),
		@Result(property = "mgr",column = "mgr",one=@One(select = "com.skb.ibatis.mapper.EmployeeMapper.findEmpById")),
		@Result(property = "dept",column="deptno",one=@One(select = "com.skb.ibatis.mapper.DepartmentMapper.findDeptById"))
	})
	Employee findEmpById(Integer id);
	
	@Select("select * from emp")
	@ResultMap(EMP_RESULT)
	List<Employee> findAll();
	
//	@Select("select * from emp where deptno=#{id}")
//	@ResultMap(EMP_RESULT)
	@SelectProvider(type = EmployeeProvider.class,method="findEmpByDeptId1")
	List<Employee> findEmpByDeptId(@Param("deptid")Integer id);
	
//	@SelectProvider(type = EmployeeProvider.class,method="findEmpByDeptId2")
//	List<Employee> findEmpByDeptId(Integer id);

	@Select("select * from emp where empno=#{empid} and mgr=#{mgrid}")
	@ResultMap(EMP_RESULT)
	@ConstructorArgs({
		  @Arg(column = "sal", javaType = Integer.class),
		})
	List<Employee> findEmpByEmpIdMgrId(Integer empid, Integer mgrid);
	
	@Update("update emp set sal=#{sal} where empno=#{empno}")
	int updateEmpSal(Employee emp);
	
	@Insert("insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(#{empno},#{ename},#{job},#{mgr.empno},#{hiredate},#{sal},#{comm},#{dept.deptno})")
	@SelectKey(statement = "select max(empno)+1 as maxemp from emp",keyProperty = "empno",before = true,resultType = int.class,statementType = StatementType.STATEMENT)
	int saveEmployee(Employee emp);

}
