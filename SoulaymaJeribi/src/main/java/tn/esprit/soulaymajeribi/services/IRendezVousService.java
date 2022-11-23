package tn.esprit.soulaymajeribi.services;

import tn.esprit.soulaymajeribi.entities.RendezVous;
import tn.esprit.soulaymajeribi.entities.Specialite;

import java.util.Date;
import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient);
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);
    public int getNbrRendezVousMedecin(Long idMedecin);
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate);

}
