package dao;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("black", 2004, 3008));
        carList.add(new Car("yellow", 2003, 3005));
        carList.add(new Car("red", 2002, 3003));
        carList.add(new Car("blue", 2001, 3002));
        carList.add(new Car("white", 990, 3001));
    }

    public List<Car> getCarList() {
        return carList;
    }
}
