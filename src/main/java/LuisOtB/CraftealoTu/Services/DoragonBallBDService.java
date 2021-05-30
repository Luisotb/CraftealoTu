package LuisOtB.CraftealoTu.Services;

import java.util.ArrayList;

import LuisOtB.CraftealoTu.Models.DoragonBallModel;
import LuisOtB.CraftealoTu.Repositories.DoragonBallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoragonBallBDService {
    @Autowired
    DoragonBallRepository doragonBallRepository;

    public ArrayList<DoragonBallModel> personajesdragonball() {
        return (ArrayList<DoragonBallModel>) doragonBallRepository.findAll();
    }

    public DoragonBallModel guardarpersonaje(DoragonBallModel personajes) {
        return doragonBallRepository.save(personajes);
    }
}
