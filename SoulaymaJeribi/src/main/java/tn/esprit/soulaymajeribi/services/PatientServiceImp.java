package tn.esprit.soulaymajeribi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.soulaymajeribi.entities.Patient;
import tn.esprit.soulaymajeribi.repository.PatientRepository;

@Service
public class PatientServiceImp implements IPatientService{
    @Autowired
    PatientRepository patientRepository;


    @Override
    public void addPatient(Patient patient)
        {
            patientRepository.save(patient);
        }

}
