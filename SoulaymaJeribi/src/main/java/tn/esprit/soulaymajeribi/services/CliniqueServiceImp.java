package tn.esprit.soulaymajeribi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.soulaymajeribi.entities.Clinique;
import tn.esprit.soulaymajeribi.repository.CliniqueRepository;

@Service
public class CliniqueServiceImp implements ICliniqueService{
    @Autowired
    CliniqueRepository cliniqueRepository;

    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }
}
