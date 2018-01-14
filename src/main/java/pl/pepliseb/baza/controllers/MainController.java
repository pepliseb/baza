package pl.pepliseb.baza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pepliseb.baza.models.ReservationModel;
import pl.pepliseb.baza.models.repositories.ReservationRepository;
import pl.pepliseb.baza.models.services.StringService;

import java.sql.Date;
import java.util.Calendar;


@Controller
public class MainController {

    @Autowired
    StringService stringService;

    @Autowired
    ReservationRepository reservationRepository;


    @GetMapping("/")
    @ResponseBody
    public String index() {
//        w tym miejscu zapisujemy recznie cos do tabeli (encji)
        ReservationModel model = new ReservationModel();
        model.setAdres("Opole");
        model.setDate(new Date(Calendar.getInstance().getTimeInMillis()));
        model.setLastname("Sebastian");
        model.setName("Nowak");
        reservationRepository.save(model);
                return "Hej, zapisałem dane ";

    }

}
