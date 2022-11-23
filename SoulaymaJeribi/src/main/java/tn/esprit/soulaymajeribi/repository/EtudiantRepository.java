package tn.esprit.soulaymajeribi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.soulaymajeribi.entities.Etudiant;

import javax.persistence.criteria.CriteriaBuilder;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
