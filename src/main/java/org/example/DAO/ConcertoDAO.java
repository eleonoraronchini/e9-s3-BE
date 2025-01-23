package org.example.DAO;

import org.example.entities.Concerto;
import org.example.entities.Partecipazione;

import javax.persistence.EntityManager;

public class ConcertoDAO {

    public static EntityManager em;

    public ConcertoDAO(EntityManager em) {
        this.em = em;
    }

    public static void save_concerto(Concerto c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }

    public void get_concertoById (long id){
        em.find(Concerto.class, id);
    }

    public void remove_concerto (Concerto c){
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }

}
