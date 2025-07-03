package br.com.ruan.info.dao;

import br.com.ruan.info.entity.Car;

import javax.persistence.EntityManager;
import java.util.List;

public class CarDao {

    private EntityManager entityManager;

    public CarDao(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public void registerCar(final Car car){
        this.entityManager.persist(car);
    }

    public Car findById(final Integer id){
        return this.entityManager.find(Car.class, id);
    }

    public List<Car> findAll(){
        String jpql = "SELECT c FROM Car c";
        return this.entityManager.createQuery(jpql, Car.class).getResultList();
    }

    public void update(final Car car){
        this.entityManager.merge(car);
    }

    public void delete(final Car car){
        this.entityManager.remove(car);
    }
}
