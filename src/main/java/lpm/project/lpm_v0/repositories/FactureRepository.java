package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
