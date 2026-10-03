package com.example.patientdata.exception;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(Long id) {
        super("Patient with id No : " +id+ " not found");
    }
    
}
