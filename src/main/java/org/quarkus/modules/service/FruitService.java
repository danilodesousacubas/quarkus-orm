package org.quarkus.modules.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.quarkus.modules.model.Fruit;

@ApplicationScoped
public class FruitService {
    @Inject
    EntityManager entityManager; 

    @Transactional 
    public void createFruit(final String name) {
        Fruit fruit = new Fruit();
        fruit.setName(name);
        entityManager.persist(fruit);
    }
}