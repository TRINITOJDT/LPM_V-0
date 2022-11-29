package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.PlusProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlusProduitRepository extends JpaRepository<PlusProduit,Long> {
    PlusProduit findTopByDesignationOrderByNiveauPAsc(String nomP);
}
