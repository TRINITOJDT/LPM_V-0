package lpm.project.lpm_v0.Services;


import lpm.project.lpm_v0.repositories.AchatProduitRepository;
import lpm.project.lpm_v0.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired private AchatProduitRepository achatProduitRepository;
    //@Autowired private StockRepository stockRepository;

    public void enregistrerLesAttentes(Long id){
        achatProduitRepository.deleteById(id);
    }


}
