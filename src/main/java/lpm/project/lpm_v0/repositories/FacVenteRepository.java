package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.FacVente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FacVenteRepository extends JpaRepository<FacVente,Integer> {
    List<FacVente> findAllByDateFacVenteBetweenOrderByDateFacVenteDesc(Date dateDebut, Date dateFin);
}
