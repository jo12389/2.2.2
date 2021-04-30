package spring.service;

import spring.dao.CarDAO;
import spring.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
  private CarDAO carDao;

    public List<Car> getListFromService(Integer carsNumber) {
        if (carsNumber == null || carsNumber >= 5) {
            return carDao.getCarList();
        } else {
            return carDao.getCarList().subList(0, carsNumber);
        }
    }
}
