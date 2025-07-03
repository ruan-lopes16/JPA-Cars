package br.com.ruan.info.service.test;

import br.com.ruan.info.dao.CarDao;
import br.com.ruan.info.entity.Car;
import br.com.ruan.info.util.DataLoading;
import br.com.ruan.info.util.JPAUtil;

import javax.persistence.EntityManager;

public class CarService {
    public static void main(String[] args) {
        EntityManager entityManager = JPAUtil.getEntityManagerCars();
        entityManager.getTransaction().begin();

        DataLoading.registerCar(entityManager);

        CarDao carDao = new CarDao(entityManager);

        Car foundCar = carDao.findById(1); // buscando por ID
        System.out.println("The id 1 car is: " + foundCar);

        Car carToDelete = carDao.findById(1);
        carDao.delete(carToDelete);
        System.out.println("The deleted car was: " + carToDelete);
        entityManager.flush();

        Car updateCar = carDao.findById(2);
        updateCar.setYear(2010);
        carDao.update(updateCar);
        entityManager.flush();

        System.out.println("=========== Listing cars ===========");
        carDao.findAll().forEach(car -> System.out.println(car));
        // System.out.println("Listing cars: " + carDao.findAll());

        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
