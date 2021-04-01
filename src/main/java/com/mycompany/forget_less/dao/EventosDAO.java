package com.mycompany.forget_less.dao;

import com.mycompany.forget_less.bean.Eventos;
import java.awt.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EventosDAO {

    private static EntityManager em;

    public EventosDAO() {
        EventosDAO.em = Persistence.createEntityManagerFactory("myPU").createEntityManager();
    }

    public void criarEvento(String nome, String data, String descricao) {
        Eventos evento = new Eventos();
        evento.setNomeEvento(nome);
        evento.setData(data);
        evento.setDescricaoEvento(descricao);

        em.getTransaction().begin();
        em.persist(evento);
        em.getTransaction().commit();
        em.close();
    }
    public java.util.List getListaEvento(){
        
        return em.createQuery("from Eventos").getResultList();
    }
    public Eventos getEventos(int idEvento){
        Eventos evnt = em.find(Eventos.class, idEvento);
        return evnt;
    }
    public void excluirEvento(Eventos ev){
        em.getTransaction().begin();
        em.remove(ev);
        em.getTransaction().commit();
        em.close();
    }
}
