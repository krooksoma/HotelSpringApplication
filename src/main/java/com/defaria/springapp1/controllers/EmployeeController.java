package com.defaria.springapp1.controllers;

import com.defaria.springapp1.models.Employee;
import com.defaria.springapp1.services.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final StaffService staffService;

    public EmployeeController(StaffService staffService) {
        this.staffService = staffService;
    }
//    static {
//        for(int i = 0; i < 10; i++){
//            employees.add(new Employee(i, "First Name" + i, "Last Name" + i, "Position" + i));
//        }
//    }

    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", staffService.getStaff());
        return "employees";
    }
}
