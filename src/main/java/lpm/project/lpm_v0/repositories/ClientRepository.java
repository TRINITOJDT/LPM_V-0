package lpm.project.lpm_v0.repositories;

import lpm.project.lpm_v0.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Client findClientByNomPrenom(String nomPrenom);
}
