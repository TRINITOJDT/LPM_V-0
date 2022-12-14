package lpm.project.lpm_v0.Services;


import lpm.project.lpm_v0.entities.Caisse;
import lpm.project.lpm_v0.repositories.CaisseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaisseService {

    @Autowired private CaisseRepository caisseRepository;

    public List<Caisse> getTouteListe(){
        return caisseRepository.findAll();
    }

    public String pageCaisse(){
        String pageCaisse = "Pages/caisse/caisse";
        return pageCaisse;
    }
}
