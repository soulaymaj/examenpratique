package tn.esprit.soulaymajeribi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.soulaymajeribi.entities.Clinique;
import tn.esprit.soulaymajeribi.services.ICliniqueService;

@RestController
public class CliniqueController {

    @Autowired
    ICliniqueService cliniqueService;

    @PostMapping("/add_clinique")
    public Clinique addClinique (@RequestBody Clinique clinique) {
        return cliniqueService.addClinique(clinique);
    }


}
