package org.example.DAO;

import org.example.entities.Partecipazione;
import org.example.entities.Persona;

import javax.persistence.EntityManager;

public class PartecipazioneDAO {
    private EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save_partecipazione(Partecipazione partecipazione) {
        em.getTransaction().begin();
        em.persist(partecipazione);
        em.getTransaction().commit();
    }

    public void get_partecipazioneById (long id){
        em.find(Partecipazione.class, id);
    }

    public void remove_partecipazione (Partecipazione partecipazione){
        em.getTransaction().begin();
        em.remove(partecipazione);
        em.getTransaction().commit();
    }
}