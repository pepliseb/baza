package pl.pepliseb.baza.models.forms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.zip.DataFormatException;

public class ReservationForm {
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastname;
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private String adres;

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    public Date getFormatedDate() {
//        RRRR-MM-DD

        try {
            return new Date(format.parse(date).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}