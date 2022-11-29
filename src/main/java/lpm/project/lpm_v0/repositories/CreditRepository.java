package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreditRepository extends JpaRepository<Credit,Long> {
    List<Credit> findAllByClientCredit(String nomCLient);
}
