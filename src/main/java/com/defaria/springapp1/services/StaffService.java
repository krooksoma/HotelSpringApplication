package com.defaria.springapp1.services;

import com.defaria.springapp1.data.StaffRepository;
import com.defaria.springapp1.models.StaffMember;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getStaff() {
        return staffRepository.findAll();
    }
}
