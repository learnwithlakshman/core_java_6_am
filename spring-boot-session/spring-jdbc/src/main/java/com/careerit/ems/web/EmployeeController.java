package com.careerit.ems.web;

import com.careerit.ems.domain.Employee;
import com.careerit.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/all")
  public ResponseEntity<List<Employee>> getEmployees() {
    return ResponseEntity.ok(employeeService.getEmployees());
  }

  @PostMapping
  public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
    return ResponseEntity.ok(employeeService.addEmployee(employee));
  }

  @PutMapping
  public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
    return ResponseEntity.ok(employeeService.updateEmployee(employee));
  }

  @DeleteMapping("/{empno}")
  public ResponseEntity<String> deleteEmployee(@PathVariable("empno") int empno) {
    boolean isDeleted = employeeService.deleteEmployee(empno);
    if (isDeleted) {
      return ResponseEntity.ok("Deletion of employee is successful");
    } else {
      return ResponseEntity.ok("Delete operation failed");
    }
  }
  @GetMapping("/{empno}")
  public ResponseEntity<Employee> getEmployee(@PathVariable("empno")int empno) {
    return ResponseEntity.ok(employeeService.getEmployeeById(empno));
  }


  @GetMapping("/search/{str}")
  public ResponseEntity<List<Employee>> search(@PathVariable("str") String str) {
    return ResponseEntity.ok(employeeService.search(str));
  }


}
