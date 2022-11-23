package tn.esprit.soulaymajeribi.services;

import tn.esprit.soulaymajeribi.entities.Medecin;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId);
}
