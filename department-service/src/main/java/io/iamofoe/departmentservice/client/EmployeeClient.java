package io.iamofoe.departmentservice.client;

import io.iamofoe.departmentservice.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface EmployeeClient {
    @GetExchange("/employee/department/{id}")
    List<Employee> findByDepartment(@PathVariable long id);
}
