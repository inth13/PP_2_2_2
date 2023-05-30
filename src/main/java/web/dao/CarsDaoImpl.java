package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarsDaoImpl implements CarsDao {
    @Override
    public List<Car> findAll() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Skoda", 1, "blue"));
        carsList.add(new Car("Audi", 2, "red"));
        carsList.add(new Car("Renault", 3, "green"));
        carsList.add(new Car("Nissan", 4, "black"));
        carsList.add(new Car("Toyota", 5, "white"));
        return carsList;
    }
}
