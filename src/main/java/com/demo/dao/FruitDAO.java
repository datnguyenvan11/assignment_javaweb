package com.demo.dao;

import com.demo.model.Category;
import com.demo.model.Fruit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class FruitDAO {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void insertFruit(Fruit fruit){
        entityManager.getTransaction().begin();
        entityManager.persist(fruit);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void insertCategory(Category category){
        entityManager.getTransaction().begin();
        entityManager.persist(category);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Category> getAllCategory(){
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Category> list = entityManager.createQuery("select c from Category c", Category.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return list;
    }

    public List<Fruit> getAllFruit(){
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Fruit> list = entityManager.createQuery("select c from Fruit c", Fruit.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return list;
    }
}
