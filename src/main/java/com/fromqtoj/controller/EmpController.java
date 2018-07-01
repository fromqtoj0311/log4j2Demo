package com.fromqtoj.controller;

import com.fromqtoj.bean.Employee;
import com.fromqtoj.mapper.EmployeeMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
  private Logger logger = LoggerFactory.getLogger(EmpController.class);

  @Autowired
  EmployeeMapper employeeMapper;

  @GetMapping("/emp")
  public Employee insertEmployee(Employee employee) {

    employee.setEmail("123@163.com");
    employee.setGender(1);
    employee.setLastName("log4j22222");

    logger.trace("Employee 日志输出 trace");
    logger.debug("Employee 日志输出 debug");
    logger.info("Employee 日志输出 info");
    logger.warn("Employee 日志输出 warn");
    logger.error("Employee 日志输出 error");
    employeeMapper.insertEmp(employee);
    return employee;
  }

  @GetMapping("/emp/delete")
  public void deleteEmp(@RequestParam("id") Integer id) {
    employeeMapper.deleteEmpbyId(id);
  }

  @GetMapping("/emp/update")
  public void updateEmpbyId(@RequestParam("id") Integer id) {
    employeeMapper.updateEmpbyId(id);
  }

  @GetMapping("/emp/select")
  public Employee selectEmp(@RequestParam("id") Integer id) {
    return employeeMapper.selectEmpById(id);
  }
}
