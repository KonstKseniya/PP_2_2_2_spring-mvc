package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Honda", "Fit", 2006));
        cars.add(new Car("Mercedes-Benz", "G-Class", 2004));
        cars.add(new Car("Lexus", "LX570", 2019));
        cars.add(new Car("Toyota", "Camry", 2018));
        cars.add(new Car("Kia", "Rio", 2020));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
