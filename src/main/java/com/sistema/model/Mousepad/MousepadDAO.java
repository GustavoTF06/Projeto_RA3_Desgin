package com.sistema.model.Mousepad;

import com.sistema.util.JPAUtil;
import javax.persistence.EntityManager;
import java.util.List;

public class MousepadDAO {

    public void salvar(Mousepad mousepad) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(mousepad);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Mousepad buscar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Mousepad.class, id);
        } finally {
            em.close();
        }
    }

    public List<Mousepad> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT m FROM Mousepad m", Mousepad.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public Mousepad atualizar(Mousepad mousepad) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Mousepad atualizado = em.merge(mousepad);
            em.getTransaction().commit();
            return atualizado;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Mousepad mousepad = em.find(Mousepad.class, id);
            if (mousepad != null) {
                em.getTransaction().begin();
                em.remove(mousepad);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}