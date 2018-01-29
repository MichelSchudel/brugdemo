package nl.brugdemo;

import java.util.Date;

/**
 * Er zijn diverse spoorbruggen in Nederland die open en dicht kunnen.
 * Dit object stelt een openings en sluitingstijd van een brug voor.
 */
public class BrugopeningDto {

    private String brugNaam;
    private Date gaatOpen;
    private Date gaatDicht;

    public String getBrugNaam() {
        return brugNaam;
    }

    public void setBrugNaam(String brugNaam) {
        this.brugNaam = brugNaam;
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
