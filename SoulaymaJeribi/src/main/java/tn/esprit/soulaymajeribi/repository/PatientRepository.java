package tn.esprit.soulaymajeribi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.soulaymajeribi.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
