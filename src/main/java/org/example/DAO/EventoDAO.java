package org.example.DAO;

import org.example.entities.Concerto;
import org.example.entities.Evento;
import org.example.entities.genere;

import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import java.util.List;


@NamedQuery(name = "getPartiteVinteInCasa",query = "SELECT p FROM PartitaDiCalcio p WHERE p = p.numeroGolSquadraDiCasa ")
public class EventoDAO {

    public static EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public static void save(Evento evento) {
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
    }

    public Evento getbyID(long id) {
        return em.find(Evento.class, id);
    }

    public void remove(Evento evento) {
        em.getTransaction().begin();
        em.remove(evento);
        em.getTransaction().commit();
    }
 public static List <Concerto> getConcertiInStreaming(){
     Query q = em.createQuery("SELECT c FROM Concerto c WHERE c.inStreaming = true" );
             return q.getResultList();
 }

 public static List <Concerto> getConcertiPerGenere (genere genere){
        Query q = em.createQuery("SELECT c FROM Concerto c WHERE c.genere = :genere");
        q.setParameter("genere", genere);
        return q.getResultList();
 }
}


