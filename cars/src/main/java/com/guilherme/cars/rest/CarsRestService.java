package com.guilherme.cars.rest;


import com.guilherme.cars.interfaces.CarsService;
import com.guilherme.cars.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsRestService {

    @Autowired
    private CarsService carsService;

    @GetMapping("/{id}")
    public ResponseEntity<Cars> getCars(@PathVariable String id){
        Cars cars = carsService.buscaCars(id);
        return cars != null ? ResponseEntity.ok().body(cars) : ResponseEntity.notFound().build();
    }
}
