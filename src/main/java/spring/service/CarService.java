package spring.service;

import spring.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarService {
    List<Car> getListFromService(Integer carsNumber);
}
