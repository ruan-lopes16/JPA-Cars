package br.com.ruan.info.util;

import br.com.ruan.info.dao.CarDao;
import br.com.ruan.info.entity.Car;

import javax.persistence.EntityManager;
import java.util.List;

public class DataLoading {

    private DataLoading(){
    }

    public static void registerCar(EntityManager entityManager) {

        CarDao carDao = new CarDao(entityManager);

        Car sentra = new Car("Sentra", "Nissan", 2024);
        Car corsa = new Car("Corsa", "Chevrolet", 2004);
        Car palioAdventure = new Car("Palio Adventure", "Fiat", 2009);
        Car up = new Car("Up!", "Volkswagen", 2015);

        carDao.registerCar(sentra);
        carDao.registerCar(corsa);
        carDao.registerCar(palioAdventure);
        carDao.registerCar(up);

        entityManager.flush();
        entityManager.clear();

    }
}
