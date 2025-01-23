package org.example.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue
    private long ID;

    @Column(nullable = false)
    private String nome;

    @Column (nullable = false)
    private String città;


    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Evento> location;

    public Location() {
    }

    public Location(String nome, String città) {
        this.nome = nome;
        this.città = città;
        this.location = new ArrayList<Evento>();
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

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public List<Evento> getLocation() {
        return location;
    }

    public void setLocation(List<Evento> location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return
                "Id:" + ID +
                ", nome:" + nome +
                ", città:" + città +
                ", location:" + location
                ;
    }
}
