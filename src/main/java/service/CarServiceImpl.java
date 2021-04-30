package service;

import dao.CarDAO;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class CarServiceImpl implements CarService  {
    @Autowired
    CarDAO carDao;

    public List<Car> getListFromService(Integer carsNumber) {
        if (carsNumber == null || carsNumber >= 5) {
            return carDao.getCarList();
        } else {
            return carDao.getCarList().subList(0, carsNumber);
        }
    }
}
