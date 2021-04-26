package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {

    private List<Car> carList;

    public CarDAO() {
        carList = new ArrayList<>();
        carList.add(new Car("black", 2000, 3000));
        carList.add(new Car("black", 2000, 3000));
        carList.add(new Car("black", 2000, 3000));
        carList.add(new Car("black", 2000, 3000));
        carList.add(new Car("black", 2000, 3000));
    }
    public List<Car> getCarList() {
        return carList;
    }
}
