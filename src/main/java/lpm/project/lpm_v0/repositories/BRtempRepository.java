package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.BRtemp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BRtempRepository extends JpaRepository<BRtemp,Long> {
    List<BRtemp> findAllByBr(int br);
}
