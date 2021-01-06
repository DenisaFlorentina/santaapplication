package santahoho.santahohoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santahoho.santahohoapp.models.Tara;
import santahoho.santahohoapp.repositories.TaraRepository;

import java.util.List;

@Service
public class TaraService {
    @Autowired
    private TaraRepository taraRepository;

    //returneaza lista de tari
    public List<Tara> getTara(){
        return taraRepository.findAll();
    }
    public void save(Tara tara) {
        taraRepository.saveAndFlush(tara);
    }
}
