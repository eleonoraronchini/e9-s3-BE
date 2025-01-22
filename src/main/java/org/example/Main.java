package org.example;

import org.example.DAO.EventoDAO;
import org.example.DAO.LocationDAO;
import org.example.DAO.PartecipazioneDAO;
import org.example.DAO.PersonaDAO;
import org.example.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.find;

public class Main
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("esercizio9");
    private static EntityManager em = emf.createEntityManager();
    public static void main( String[] args ) {

        //CREO ELEMENTIDAO
        EventoDAO eventoDao = new EventoDAO(em);
        PersonaDAO personaDao = new PersonaDAO(em);
        LocationDAO locationDao = new LocationDAO(em);
        PartecipazioneDAO partecipazioneDao = new PartecipazioneDAO(em);


        //LISTE PARTECIPAZIONI
        List<Partecipazione> partecipazioni = new ArrayList<Partecipazione>();
        List<Partecipazione> partecipazioni2 = new ArrayList<Partecipazione>();

        //LISTE EVENTI
        List<Evento> eventi = new ArrayList<Evento>();
        List<Evento> eventi2 = new ArrayList<Evento>();

        //ELENCO DELLE LOCATION
        Location location1 = new Location("Arena i Tre Martiri", "Rimini");
        Location location2 = new Location("Pizzeria da Luciano","Roma");
        Location location4 = new Location("Parco degli Agolanti","Riccione");
        Location location5 = new Location("Discoteca MammaMia","Senigallia");
        Location location6 = new Location ("Ristorante ai Mulini","Viterbo");

        //ELENCO DEGLI EVENTI
        Evento evento1 = new Evento ("Festa di Carnevale", LocalDate.of(2025, 01, 20), "Festa a tema, entrata obbligatoria con la maschera", tipoEvento.PUBBLICO, 132,location4);
        Evento evento2 = new Evento("Diciottesimo Carlo", LocalDate.of(2025, 06, 05), "Festa di compleanno", tipoEvento.PRIVATO, 55, location2);
        Evento evento3 = new Evento("Nozze d'Oro Elisa e Mauro", LocalDate.of(2025, 03, 25), "Festa anniversario matrimonio", tipoEvento.PRIVATO, 28,location6);
        Evento evento4 = new Evento("Compleanno Davide", LocalDate.of(2026, 06, 05), "Festa di compleanno", tipoEvento.PRIVATO, 60,location5);
        Evento evento5 = new Evento("Festa Aziendale PAPPAPPERO SRL", LocalDate.of(2025, 05, 10), "Festa Aziendale", tipoEvento.PRIVATO, 267, location2);
        Evento evento6 = new Evento("Concerto Nino D'Angelo", LocalDate.of(2025, 12, 23), "Concerto Nino D'Angelo", tipoEvento.PUBBLICO, 1000,location1);
        Evento evento7 = new Evento("Concerto Metal Malevolent", LocalDate.of(2025, 01, 31), "Apertura porte: h.22", tipoEvento.PUBBLICO, 150, location5);



        //ELENCO PERSONE
        Persona persona1 = new Persona("Caterina", "Marchi", "caterinamarchi@gmail.com", LocalDate.of(1998, 3, 24), sessoPersona.F);
        Persona persona2 = new Persona("Marco", "Marini", "marco.marini@yahoo.it", LocalDate.of(1996, 4, 12), sessoPersona.M);
        Persona persona3 = new Persona("Matilde", "Lazzari", "matilde04@outlook.it", LocalDate.of(1998, 12, 2), sessoPersona.F);
        Persona persona4 = new Persona("Giacomo", "Righetti", "giacomo34.23@gmail.com", LocalDate.of(1999, 9, 20), sessoPersona.M);
        Persona persona5 = new Persona("Allegra", "Savoretti", "allegea.sav@yahoo.it", LocalDate.of(2001, 2, 15), sessoPersona.F);
        Persona persona6 = new Persona("Eleonora", "Ronchini", "eleonora.ronchini@outlook.it", LocalDate.of(1997, 6, 28), sessoPersona.F);
        Persona persona7 = new Persona("Alberto", "Fraternali", "haku.yu@hgmail.com", LocalDate.of(1995, 12, 10), sessoPersona.M);
        Persona persona8 = new Persona("Teo", "Tentoni", "teotentoni@gmail.com", LocalDate.of(1997, 7, 3), sessoPersona.M);

        //ELENCO PARTECIPAZIONI
        Partecipazione partecipazione1 = new Partecipazione(persona1, evento2, statoPartecipazione.CONFERMATA);
        Partecipazione partecipazione2 = new Partecipazione(persona2, evento1, statoPartecipazione.DA_CONFERMARE);
        Partecipazione partecipazione3 = new Partecipazione(persona8, evento6, statoPartecipazione.DA_CONFERMARE);
        Partecipazione partecipazione4 = new Partecipazione(persona7, evento7, statoPartecipazione.CONFERMATA);
        Partecipazione partecipazone5 = new Partecipazione(persona6, evento7, statoPartecipazione.CONFERMATA);
        Partecipazione partecipazione6 = new Partecipazione(persona5,evento5,statoPartecipazione.DA_CONFERMARE);
        Partecipazione partecipazione7 = new Partecipazione(persona3,evento1,statoPartecipazione.CONFERMATA);




         //COMANDI PER SALVARE, RIMUOVERE O CERCARE NEL DATABASE:
         /*personaDao.save_persona(persona1);
         personaDao.save_persona(persona2);
         personaDao.save_persona(persona3);
         personaDao.save_persona(persona4);
         personaDao.save_persona(persona5);
         personaDao.save_persona(persona6);
         personaDao.save_persona(persona7);
         personaDao.save_persona(persona8);*/

        /*locationDao.save_location(location1);
        locationDao.save_location(location2);
        locationDao.save_location(location4);
        locationDao.save_location(location5);
        locationDao.save_location(location6);*/

       /* partecipazioneDao.save_partecipazione(partecipazione1);
        partecipazioneDao.save_partecipazione(partecipazione2);
        partecipazioneDao.save_partecipazione(partecipazione3);
        partecipazioneDao.save_partecipazione(partecipazione4);
        partecipazioneDao.save_partecipazione(partecipazone5);
        partecipazioneDao.save_partecipazione(partecipazione6);
        partecipazioneDao.save_partecipazione(partecipazione7);*/



       eventoDao.remove(evento2);
       personaDao.remove_persona(persona1);
        // eventoDao.save(evento1);


    }

}