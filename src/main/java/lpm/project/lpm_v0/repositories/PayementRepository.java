package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Payement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PayementRepository extends JpaRepository<Payement,Long> {
    List<Payement> findAllByTypePayement(String typePaye);
}
