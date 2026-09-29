package com.example.patientdata.repository;

import com.example.patientdata.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
