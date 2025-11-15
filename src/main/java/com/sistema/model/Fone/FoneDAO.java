package com.sistema.model.Fone;

import com.sistema.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class FoneDAO {

    public void salvar(Fone fone) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(fone);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Fone buscar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Fone.class, id);
        } finally {
            em.close();
        }
    }

    public List<Fone> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Fone> query = em.createQuery("SELECT f FROM Fone f", Fone.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Fone atualizar(Fone foneAtualizado) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Fone fone = em.merge(foneAtualizado);
            em.getTransaction().commit();
            return fone;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Fone fone = em.find(Fone.class, id);
            if (fone != null) {
                em.getTransaction().begin();
                em.remove(fone);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}