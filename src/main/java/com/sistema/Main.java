package com.sistema;

import com.sistema.model.Usuario;
import javax.persistence.*;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistema-persistence");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Iniciando operações no banco");

            em.getTransaction().begin();

            Usuario usuario1 = new Usuario("Eduardo", "dud@email.com", "teste");
            em.persist(usuario1);

            em.getTransaction().commit();

            System.out.println("Usuário salvo com ID: " + usuario1.getId());

            Usuario usuarioBuscado = em.find(Usuario.class, usuario1.getId());
            System.out.println("Usuário buscado: " + usuarioBuscado);

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}