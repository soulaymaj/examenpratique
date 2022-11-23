package tn.esprit.soulaymajeribi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tn.esprit.soulaymajeribi.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
}
