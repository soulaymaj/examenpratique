package tn.esprit.soulaymajeribi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.soulaymajeribi.entities.Medecin;
import tn.esprit.soulaymajeribi.services.IMedecinService;

@RestController
public class MedecinController {
    @Autowired
    IMedecinService medecinService;

    @PostMapping("/add_medecin/{cliniqueId}")
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable("cliniqueId") Long cliniqueId) {
        return medecinService.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }
}
