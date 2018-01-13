package pl.pepliseb.baza.models.services;

import java.util.UUID;

public class StringService {

    public String generateRandomString(){
        return UUID.randomUUID().toString();
    }
}
