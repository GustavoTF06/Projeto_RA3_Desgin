package com.sistema.model.Notebook;

import com.sistema.util.*;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class NotebookDAO {

    public void salvar(Notebook notebook) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(notebook);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    public Notebook buscarPorId(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Notebook.class, id);
        } finally {
            em.close();
        }
    }

    public List<Notebook> listarTodos() {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            TypedQuery<Notebook> query =
                    em.createQuery("SELECT n FROM Notebook n", Notebook.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    public Notebook atualizar(Notebook notebookAtualizado) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            Notebook notebook = em.merge(notebookAtualizado);
            em.getTransaction().commit();
            return notebook;
        } finally {
            em.close();
        }
    }

    public void deletar(Long id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Notebook notebook = em.find(Notebook.class, id);

            if (notebook != null) {
                em.getTransaction().begin();
                em.remove(notebook);
                em.getTransaction().commit();
            }

        } catch (Exception e) {
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            throw e;
        } finally {
            em.close();
        }
    }
}
