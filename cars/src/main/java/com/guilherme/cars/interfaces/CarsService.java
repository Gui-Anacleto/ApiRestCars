package com.guilherme.cars.interfaces;

import com.guilherme.cars.model.Cars;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url="http://api-test.bhut.com.br:3000/api/cars" , name="bhut")
public interface CarsService {
    @GetMapping("{id}")
    Cars buscaCars(@PathVariable("id")String id);
}
