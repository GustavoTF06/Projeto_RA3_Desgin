package com.sistema.model.Mouse;

import com.sistema.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MouseDAO {

    public void salvar(Mouse mouse) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(mouse);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Mouse buscar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Mouse.class, id);
        } finally {
            em.close();
        }
    }

    public List<Mouse> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Mouse> query = em.createQuery("SELECT m FROM Mouse m", Mouse.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Mouse atualizar(Mouse mouseAtualizado) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Mouse mouse = em.merge(mouseAtualizado);
            em.getTransaction().commit();
            return mouse;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Mouse mouse = em.find(Mouse.class, id);
            if (mouse != null) {
                em.getTransaction().begin();
                em.remove(mouse);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}
