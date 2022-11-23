package tn.esprit.soulaymajeribi.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.soulaymajeribi.entities.Etudiant;
import tn.esprit.soulaymajeribi.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImp implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant getEtudiantById(int id) {
        return etudiantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public void deleteEtudiant(int id) {

    }
}
