package org.emp.employeeController;

import lombok.RequiredArgsConstructor;
import org.emp.dto.Employee;
import org.emp.entity.EmployeeEntity;
import org.emp.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//This is the network request handling class. network request is a api trigger coming from front-end. we tell that using rest controller annotation
@RestController
@RequestMapping("/emp-controller")
//URL-> http://localhost:8080/emp-controller/add-employee
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeServiceImpl service;

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);

    }
    @GetMapping("get-all")
    public List<EmployeeEntity> getAll(){
        return service.getAll();
    }


}

