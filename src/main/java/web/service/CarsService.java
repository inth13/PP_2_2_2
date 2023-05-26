package web.service;

import web.model.Car;
import java.util.List;

public class CarsService {

    public static List<Car> getNumbersOfCars(List<Car> carsList, int count) {
        if (count == 0 || count >= 5) {
            return carsList;
        }
        return carsList.stream().limit(count).toList();
    }
}
