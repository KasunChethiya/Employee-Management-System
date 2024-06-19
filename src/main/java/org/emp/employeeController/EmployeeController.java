package org.emp.employeeController;

import org.emp.dto.Employee;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//This is the network request handling class. network request is a api trigger coming from front-end. we tell that using rest controller annotation
@RestController
@RequestMapping("/emp-controller")
//URL-> http://localhost:8080/emp-controller/add-employee
public class EmployeeController {
    List<Employee> employeeList = new ArrayList();

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);

    }
    @GetMapping("get-all")
    public List<Employee> getAll(){
        return employeeList;
    }


}

