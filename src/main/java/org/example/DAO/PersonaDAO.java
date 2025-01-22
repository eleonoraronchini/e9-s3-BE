package org.example.DAO;

import org.example.entities.Evento;
import org.example.entities.Partecipazione;
import org.example.entities.Persona;

import javax.persistence.EntityManager;

public class PersonaDAO {
    private EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save_persona(Persona persona) {
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
    }
    public void get_personaById (long id){
        em.find(Persona.class, id);
    }

    public void remove_persona (Persona persona){
        em.getTransaction().begin();
        em.remove(persona);
        em.getTransaction().commit();
    }
}
