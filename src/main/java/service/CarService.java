package service;

import dao.CarDAO;
import model.Car;

import java.util.List;

public class CarService {

    private final CarDAO carDao = new CarDAO();

    public List<Car> getListFromService(Integer carsNumber) {
        if (carsNumber == null || carsNumber >= 5) {
            return carDao.getCarList();
        } else {
            return carDao.getCarList().subList(0, carsNumber);
        }
    }
}
