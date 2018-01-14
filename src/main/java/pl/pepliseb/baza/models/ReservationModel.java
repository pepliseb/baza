package pl.pepliseb.baza.models;

import com.sun.org.apache.regexp.internal.RE;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.pepliseb.baza.models.forms.ReservationForm;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "reservation")
@NoArgsConstructor
public class ReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @Column(name = "name1")
    private String name;
    private String lastname;
    private Date date;
    private String adres;


    public ReservationModel(ReservationForm form){
    name = form.getName();
    date = form.getFormateDate();
    adres = form.getAdres();
    lastname= form.getLastname();
    }
}
