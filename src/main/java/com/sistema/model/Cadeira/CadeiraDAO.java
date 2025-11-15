package com.sistema.model.Cadeira;

import com.sistema.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CadeiraDAO {

    public void salvar(Cadeira cadeira) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cadeira);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Cadeira buscar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Cadeira.class, id);
        } finally {
            em.close();
        }
    }

    public List<Cadeira> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Cadeira> query = em.createQuery("SELECT c FROM Cadeira c", Cadeira.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Cadeira atualizar(Cadeira cadeiraAtualizada) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Cadeira cadeira = em.merge(cadeiraAtualizada);
            em.getTransaction().commit();
            return cadeira;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Cadeira cadeira = em.find(Cadeira.class, id);
            if (cadeira != null) {
                em.getTransaction().begin();
                em.remove(cadeira);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}