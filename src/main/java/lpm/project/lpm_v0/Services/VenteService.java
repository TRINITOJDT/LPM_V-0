package lpm.project.lpm_v0.Services;


import lpm.project.lpm_v0.entities.Produit;
import lpm.project.lpm_v0.entities.Vente;
import lpm.project.lpm_v0.repositories.VenteProduitRepository;
import lpm.project.lpm_v0.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenteService {

    @Autowired private VenteRepository venteRepository;
    @Autowired private VenteProduitRepository venteProduitRepository;

    
    public List<Vente> donnerTousLesVentes(){
        List<Vente> venteList = venteRepository.findAll();
        return venteList;
    }

    public String pageVente(){
        String pageVente = "Pages/vente/vente";
        return pageVente;
    }

    public void enregistrerLesAttentesVente(Long id){
        venteProduitRepository.deleteById(id);
    }
}
