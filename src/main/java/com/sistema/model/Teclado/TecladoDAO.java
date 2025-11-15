package com.sistema.model.Teclado;

import com.sistema.util.JPAUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class TecladoDAO {

    public void salvar(Teclado teclado) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(teclado);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Teclado buscar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Teclado.class, id);
        } finally {
            em.close();
        }
    }

    public List<Teclado> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.createQuery("SELECT t FROM Teclado t", Teclado.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }

    public Teclado atualizar(Teclado teclado) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Teclado atualizado = em.merge(teclado);
            em.getTransaction().commit();
            return atualizado;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Teclado teclado = em.find(Teclado.class, id);
            if (teclado != null) {
                em.getTransaction().begin();
                em.remove(teclado);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}
