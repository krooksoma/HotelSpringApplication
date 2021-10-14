package com.defaria.springapp1.data;

import com.defaria.springapp1.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Employee, String> {
}
