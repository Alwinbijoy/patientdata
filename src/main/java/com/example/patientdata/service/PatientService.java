package com.example.patientdata.service;

import org.springframework.stereotype.Service;
import com.example.patientdata.repository.PatientRepository;
import com.example.patientdata.entity.Patient;
import java.util.List;
import java.util.Optional;

@Service                            
public class PatientService {
    
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public Optional<Patient> getPatientById(Long id) {
        return patientRepository.findById(id);
    }

    public Patient createPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient updatedPatient) {
        return patientRepository.findById(id)
                .map(patient -> {
                    patient.setFirstName(updatedPatient.getFirstName());
                    patient.setLastName(updatedPatient.getLastName());
                    patient.setAge(updatedPatient.getAge());
                    patient.setGender(updatedPatient.getGender());
                    patient.setEmail(updatedPatient.getEmail());
                    patient.setPhone(updatedPatient.getPhone());
                    return patientRepository.save(patient);
                })
                .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }   



}
