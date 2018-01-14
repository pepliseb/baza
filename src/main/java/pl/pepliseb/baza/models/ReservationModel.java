package pl.pepliseb.baza.models;

import lombok.Data;

import java.sql.Date;

@Data
public class ReservationModel {
    private int id;
    private String name;
    private String lastname;
    private Date date;
    private String adres;

}
