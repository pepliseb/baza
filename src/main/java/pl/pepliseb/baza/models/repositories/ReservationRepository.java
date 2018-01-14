package pl.pepliseb.baza.models.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.pepliseb.baza.models.ReservationModel;

@Repository
public interface ReservationRepository  extends CrudRepository<ReservationModel,Integer>{


}
