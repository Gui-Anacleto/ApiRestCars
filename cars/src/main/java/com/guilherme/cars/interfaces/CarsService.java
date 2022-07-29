package com.guilherme.cars.interfaces;

import com.guilherme.cars.model.Cars;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.List;

@FeignClient(url="http://api-test.bhut.com.br:3000" , name="bhut")
public interface CarsService {
    @GetMapping("/api/cars/{id}")
    Cars buscaCars(@PathVariable("id")String id);

}


