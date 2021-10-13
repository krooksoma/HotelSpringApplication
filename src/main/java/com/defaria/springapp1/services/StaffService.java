package com.defaria.springapp1.services;

import com.defaria.springapp1.models.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaffService {

    private static final List<Employee> staff = new ArrayList<>();

    static{
        for(int i= 0; i < 10; i++){
            staff.add(new Employee(i, "name" + i, "lastname" +i, "position" +i));
        }
    }

    public List<Employee> getStaff() {
        return staff;
    }
}
