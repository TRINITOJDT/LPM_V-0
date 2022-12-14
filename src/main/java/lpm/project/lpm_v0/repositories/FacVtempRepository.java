package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.FacVtemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacVtempRepository extends JpaRepository<FacVtemp,Long> {
    List<FacVtemp> findAllByBr(int fac);
    FacVtemp findTopByBr(int br);
}
