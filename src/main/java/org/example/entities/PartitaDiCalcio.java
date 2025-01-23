package org.example.entities;

import jdk.jfr.Enabled;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")
public class PartitaDiCalcio extends Evento {
    @Column(nullable = false)
    private String squadraDiCasa;

    @Column(nullable = false)
    private String squadraOspite;


    private String squadraVincente;//null se pareggio

    private int numeroGolSquadraDiCasa;

    private int numeroGolSquadraVincente;

    public PartitaDiCalcio(String titolo, LocalDate dataEvento, String descrizione, org.example.entities.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, String squadraDiCasa, String squadraOspite, String squadraVincente, int numeroGolSquadraDiCasa, int numeroGolSquadraVincente) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
        this.numeroGolSquadraVincente = numeroGolSquadraVincente;
    }

    public PartitaDiCalcio() {

    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getNumeroGolSquadraDiCasa() {
        return numeroGolSquadraDiCasa;
    }

    public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
        this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
    }

    public int getNumeroGolSquadraVincente() {
        return numeroGolSquadraVincente;
    }

    public void setNumeroGolSquadraVincente(int numeroGolSquadraVincente) {
        this.numeroGolSquadraVincente = numeroGolSquadraVincente;
    }

    @Override
    public String toString() {
        return
                "titolo:" + super.getTitolo() +
                        ",descrizione:" + super.getDescrizione() +
                ", squadra di casa:" + squadraDiCasa +
                ", squadra ospite" + squadraOspite +
                ", squadra vincente:" + squadraVincente +
                ", numero di gol squadra di casa:" + numeroGolSquadraDiCasa +
                ", numero di gol squadra vincente:" + numeroGolSquadraVincente;
    }
}
