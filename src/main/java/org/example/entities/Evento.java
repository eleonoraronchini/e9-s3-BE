package org.example.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "evento") //mettila sempre al plurale d'ora in poi!!
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //come il SERIAL in PostgreSQL
    private Long id;

    @Column(nullable = false)
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;

    @Column(length = 100, nullable = false)
    private String descrizione;

    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;

    @Column(name = "numero_max_partecipanti", nullable = false)
    private int numeroMassimoPartecipanti;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List <Partecipazione> evento;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "locazione_evento")
    private Location location;

    public Evento(String titolo, LocalDate localDate, String s, org.example.entities.tipoEvento pubblico, int i) {

    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, org.example.entities.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location location) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.evento = new ArrayList<Partecipazione>();
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public List<Partecipazione> getPartecipazioni() {
        return evento;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.evento = partecipazioni;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "id:" + id +
                ", titolo:" + titolo +
                ", data evento:" + dataEvento +
                ", descrizione:" + descrizione +
                ", tipo evento:" + tipoEvento +
                ", numero massimo di partecipanti:" + numeroMassimoPartecipanti +
                ", partecipazioni:" + evento +
                ", location:" + location
                ;
    }
}
