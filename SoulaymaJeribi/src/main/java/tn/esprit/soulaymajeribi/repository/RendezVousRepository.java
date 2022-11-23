package tn.esprit.soulaymajeribi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.soulaymajeribi.entities.RendezVous;
import tn.esprit.soulaymajeribi.entities.Specialite;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
    List<RendezVous> findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(Long idClinique, Specialite specialite);
    List<RendezVous> findByMedecinIdMedecin(Long idMedecin);
}
