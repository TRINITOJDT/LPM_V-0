package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MagasinRepository extends JpaRepository<Magasin,Long> {
    Magasin findByNomMagasin(String nomMagasin);
}
