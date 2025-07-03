package br.com.ruan.info.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory CARS = Persistence.createEntityManagerFactory("cars");

    public static EntityManager getEntityManagerCars() {
        return CARS.createEntityManager();
    }
}
