package tn.esprit.soulaymajeribi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.soulaymajeribi.entities.Clinique;
import tn.esprit.soulaymajeribi.entities.Medecin;
import tn.esprit.soulaymajeribi.repository.CliniqueRepository;
import tn.esprit.soulaymajeribi.repository.MedecinRepository;

import javax.transaction.Transactional;

@Service
public class MedecinServiceImp implements IMedecinService{

    @Autowired
    CliniqueRepository cliniqueRepository;

    @Autowired
    MedecinRepository medecinRepository;

    @Override
    @Transactional
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        clinique.getMedecins().add(medecin);
        return medecinRepository.save(medecin);
    }
}
