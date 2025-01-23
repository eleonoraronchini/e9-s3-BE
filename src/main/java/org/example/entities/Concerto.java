package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "concerti")
public class Concerto extends Evento{
    @Enumerated(EnumType.STRING)
   private genere genere;
   private boolean inStreaming;

    public Concerto(String titolo, LocalDate dataEvento, String descrizione, org.example.entities.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, org.example.entities.genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Concerto() {

    }

    public genere getGenere() {
        return genere;
    }

    public void setGenere(genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return  "titolo:" + super.getTitolo() +
                ", data:" + super.getDataEvento() +
                ", descrizione:" + super.getDescrizione() +
                ", genere:" + genere +
                ", inStreaming:" + inStreaming;
    }
}
