package com.guilherme.cars.rest;


import com.guilherme.cars.interfaces.CarsService;
import com.guilherme.cars.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CarsRestService {

    @Autowired
    private CarsService carsService;

    @GetMapping("/api/cars/{id}")
    public ResponseEntity<Cars> getCars(@PathVariable String id) {
        Cars cars = carsService.buscaCars(id);
        return cars != null ? ResponseEntity.ok().body(cars) : ResponseEntity.notFound().build();
    }

    @GetMapping("/api/listaCars")
    public List<Cars> getCars() {
        String url = "http://api-test.bhut.com.br:3000/api/cars";
        RestTemplate resTemplate = new RestTemplate();
        Cars[] cars = resTemplate.getForObject(url, Cars[].class);
        return Arrays.asList(cars);
    }

    @PostMapping(value = "/api/createCars", consumes = "application/json", produces = "application/json")
    public Cars postCars(@RequestBody Cars cars) {
        String url = "http://api-test.bhut.com.br:3000/api/cars";
        RestTemplate resTemplate = new RestTemplate();
        HttpEntity<Cars> requestEntity = new HttpEntity<>(cars);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Cars> responseEntity = restTemplate.postForEntity(url, cars, Cars.class);
        System.out.println("Status Code: " + responseEntity.getBody().toString());
        //System.out.println("Id: " + responseEntity.getBody().getId());
        System.out.println("Location: " + responseEntity.getHeaders().getLocation());
        //cars = resTemplate.postForObject(url, cars, Cars.class);

        return cars;



    }
}