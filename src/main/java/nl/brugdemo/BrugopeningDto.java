package nl.brugdemo;

import java.util.Date;

/**
 * Er ijn diverse spoorbruggen in Nederland die open en dicht kunnen.
 * Dit object stelt een openings en sluitingstijd van een brug voor.
 */
public class BrugopeningDto {

    private String naam;
    private Date gaatOpen;
    private Date gaatDicht;


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Date getGaatOpen() {
        return gaatOpen;
    }

    public void setGaatOpen(Date gaatOpen) {
        this.gaatOpen = gaatOpen;
    }

    public Date getGaatDicht() {
        return gaatDicht;
    }

    public void setGaatDicht(Date gaatDicht) {
        this.gaatDicht = gaatDicht;
    }
}
