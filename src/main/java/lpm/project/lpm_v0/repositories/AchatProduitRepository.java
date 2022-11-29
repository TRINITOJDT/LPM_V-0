package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.AchatProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchatProduitRepository extends JpaRepository<AchatProduit,Long> {
    AchatProduit findAchatProduitByNomProduit(String nomP);
    AchatProduit findTopByNomProduit(String nomP);

}
