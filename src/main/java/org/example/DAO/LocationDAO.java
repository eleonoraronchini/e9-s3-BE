package org.example.DAO;

import org.example.entities.Location;
import org.example.entities.Partecipazione;
import org.example.entities.Persona;

import javax.persistence.EntityManager;

public class LocationDAO {
    private static EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public static void save_location(Location location) {
        em.getTransaction().begin();
        em.persist(location);
        em.getTransaction().commit();
    }
    public void get_partecipazioneById (long id){
        em.find(Location.class, id);
    }

    public void remove_location (Location location){
        em.getTransaction().begin();
        em.remove(location);
        em.getTransaction().commit();
    }
}