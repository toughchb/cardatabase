package com.packt.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    List<Car> findByColor(String color);

    List<Car> findByYear(int year);

    List<Car> findByBrandAndModel(String brand, String model);

    List<Car> findByBrandOrderByYearAsc(String brand);

    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);
}
