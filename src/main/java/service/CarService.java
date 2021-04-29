package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.List;


public interface CarService {
    public List<Car> getListFromService(Integer carsNumber);
}
