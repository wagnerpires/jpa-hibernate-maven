package com.wrtecnologia.cadastrocliente;

import com.wrtecnologia.cadastrocliente.model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplo {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // BUSCAR
        //  Cliente cliente = entityManager.find(Cliente.class, 1);
        //  System.out.println(cliente.getNome());

        // INSERIR
        //  Cliente cliente = new Cliente();
        //  //cliente.setId(1);
        //  cliente.setNome("Eletro Silva");
        //  entityManager.getTransaction().begin();
        //  entityManager.persist(cliente);
        //  entityManager.getTransaction().commit();

        //EXCLUIR
        // Cliente cliente = entityManager.find(Cliente.class, 1);
        // entityManager.getTransaction().begin();
        // entityManager.remove(cliente);
        // entityManager.getTransaction().commit();

        // CACHE DE PRIMEIRO NIVEL - APENAS UMA CONSULTA SERÁ EXECUTADA NO BANCO (OBJETO GERENCIADO / GERENCIAMENTO DO HIBERNATE)
        //  Cliente cliente3 = entityManager.find(Cliente.class, 1);
        //  Cliente cliente2 = entityManager.find(Cliente.class, 1);

//        // UPDATE 1
//        Cliente cliente4 = entityManager.find(Cliente.class, 4);
//        entityManager.getTransaction().begin();
//        cliente4.setNome("Casa de Carnes Souza");
//        entityManager.getTransaction().commit();

        // UPDATE 2 - ATUALIZAÇÃO DE OBJETO NÃO GERENCIADO
//        Cliente cliente = new Cliente();
//        cliente.setId(5);
//        cliente.setNome("Armazém Estrela");
//        entityManager.getTransaction().begin();
//        entityManager.merge(cliente);
//        entityManager.getTransaction().commit();
//        entityManager.close();
//        entityManagerFactory.close();

        // INSERT 2 - INSERIR COM MERGE
        Cliente cliente = new Cliente();
        // cliente.setId(5);
        cliente.setNome("Padaria Miramar");
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

    }
}
