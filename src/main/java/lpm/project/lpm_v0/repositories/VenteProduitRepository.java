package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.VenteProduit;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VenteProduitRepository extends JpaRepository<VenteProduit,Long> {
    VenteProduit findTopByNomProduit(String nomClient);
}
