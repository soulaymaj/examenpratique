package tn.esprit.soulaymajeribi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.soulaymajeribi.entities.RendezVous;
import tn.esprit.soulaymajeribi.entities.Specialite;
import tn.esprit.soulaymajeribi.services.IRendezVousService;

import java.util.Date;
import java.util.List;

@RestController
public class RendezVousController {
    @Autowired
    IRendezVousService rdvService;
    @PostMapping("/addRDVAndAssignMedAndPatient/{idMedecin}/{idPatient}")
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv, @PathVariable("idMedecin") Long idMedecin,
                                             @PathVariable("idPatient") Long idPatient) {
        rdvService.addRDVAndAssignMedAndPatient(rdv, idMedecin, idPatient);
    }

    @GetMapping("/getRendezVousByCliniqueAndSpecialite/{idClinique}/{specialite}")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable("idClinique") Long idClinique,
                                                                 @PathVariable("specialite") Specialite specialite) {
        return rdvService.getRendezVousByCliniqueAndSpecialite(idClinique, specialite);
    }

    @GetMapping("/getNbrRendezVousMedecin/{idMedecin}")
    public int getNbrRendezVousMedecin(@PathVariable("idMedecin") Long idMedecin) {
        return rdvService.getNbrRendezVousMedecin(idMedecin);
    }

    @GetMapping("/getRevenuMedecin/{idMedecin}")
    public int getRevenuMedecin(@PathVariable("idMedecin") Long idMedecin,
                                @RequestParam Date startDate,
                                @RequestParam Date endDate) {
        return rdvService.getRevenuMedecin(idMedecin, startDate, endDate);
    }
}
