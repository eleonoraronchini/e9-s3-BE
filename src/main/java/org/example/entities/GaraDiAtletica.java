package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Evento {

    @ManyToMany
    @JoinTable(name="gare_atletica_personale",
            joinColumns = @JoinColumn(name = "gara_id"),
            inverseJoinColumns = @JoinColumn(name = "atleta_id"))
     private Set<Persona> atleti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
     private Persona vincitore;

    public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, org.example.entities.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location, Set<Persona> atleti, Persona vincitore) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica () {

    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return
               "nome:"+ super.getTitolo() +
                ", descrizione:" + super.getDescrizione()+
                ", atleti:" + atleti +
                ", vincitore:" + vincitore ;
    }
}
