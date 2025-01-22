package org.example.entities;

import javax.persistence.*;

@Entity
@Table(name = "lista_partecipazioni")
public class Partecipazione {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long ID;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name="persona")
    private Persona persona;

@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evento")
    private Evento evento;

    @Column(name = "stato_della_partecipazione", nullable = false)
    @Enumerated(EnumType.STRING)
    private statoPartecipazione statoPartecipazione;

    public Partecipazione() {
    }

    public Partecipazione( Persona persona, Evento evento, org.example.entities.statoPartecipazione statoPartecipazione) {
        this.persona = persona;
        this.evento = evento;
        this.statoPartecipazione = statoPartecipazione;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public statoPartecipazione getStatoPartecipazione() {
        return statoPartecipazione;
    }

    public void setStatoPartecipazione(statoPartecipazione statoPartecipazione) {
        this.statoPartecipazione = statoPartecipazione;
    }

    @Override
    public String toString() {
        return
                "Id:" + ID +
                ", persona:" + persona +
                ", evento:" + evento +
                ", stato della partecipazione:" + statoPartecipazione;
}
}
