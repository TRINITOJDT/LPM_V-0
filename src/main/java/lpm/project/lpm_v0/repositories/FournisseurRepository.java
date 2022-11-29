package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {
    Fournisseur findFournisseurByNomFournisseur(String nomFournisseur);
}
