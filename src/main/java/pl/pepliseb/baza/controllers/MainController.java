package pl.pepliseb.baza.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pepliseb.baza.models.repositories.ReservationRepository;
import pl.pepliseb.baza.models.services.StringService;


@Controller
public class MainController {

    @Autowired
    StringService stringService;

    @Autowired
    ReservationRepository reservationRepository;


    @GetMapping("/")
    @ResponseBody
    public String index() {
//        w tym miejscu zapisujemy recznie do tabeli (encji)
                return "Hej, zapisałem dane ";


    }


}
