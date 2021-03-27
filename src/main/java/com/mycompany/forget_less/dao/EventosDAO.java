package com.mycompany.forget_less.dao;

import com.mycompany.forget_less.bean.Eventos;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EventosDAO {

    private static EntityManager em;

    public EventosDAO() {
        EventosDAO.em = Persistence.createEntityManagerFactory("myPU").createEntityManager();
    }

    public void criarEvento(){
        Eventos evento = new Eventos();
        evento.setNomeEvento("Aniversário do Mc Beyoncé");
        evento.setData("04/09/2021");
        evento.setDescricaoEvento("Cachorro-quente e guaraná quente");
        
        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
        em.close();
    }
}
