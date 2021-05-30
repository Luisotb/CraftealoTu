package LuisOtB.CraftealoTu.Repositories;

import java.util.ArrayList;

import LuisOtB.CraftealoTu.Models.DoragonBallModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoragonBallRepository extends CrudRepository<DoragonBallModel, Long> {

}
