package org.example.entities;

import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "partecipanti")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    @Column (nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cognome;

    private String email;

    @Column(nullable = false)
    private LocalDate dataDiNascita;

    @Column(name = "sesso",nullable = false)
    @Enumerated(EnumType.STRING)
    private sessoPersona sessoPersona;

    @OneToMany(mappedBy = "persona", cascade= CascadeType.ALL)
    private List<Partecipazione> persona;

    public Persona() {
    }


    public Persona( String nome, String cognome, String email, LocalDate dataDiNascita, org.example.entities.sessoPersona sessoPersona) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.sessoPersona = sessoPersona;
        this.persona = new ArrayList<Partecipazione>();
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public sessoPersona getSessoPersona() {
        return sessoPersona;
    }

    public void setSessoPersona(sessoPersona sessoPersona) {
        this.sessoPersona = sessoPersona;
    }

    public List<Partecipazione> getPartecipazioni() {
        return persona;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.persona = persona;
    }

    public List<Partecipazione> getPersona() {
        return persona;
    }

    public void setPersona(List<Partecipazione> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return
                "ID: " + ID +
                ", nome:" + nome +
                ", cognome:" + cognome +
                ", email:" + email +
                ", data di nascita:'" + dataDiNascita +
                ", sesso:" + sessoPersona +
                ", partecipazioni:" + persona
                ;
    }
}
