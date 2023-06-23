package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {

    private final CarsDao carsDao;

    public CarsServiceImpl(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public List<Car> getNumbersOfCars(int count) {
        if (count < 0 || count >= 5) {
            return carsDao.findAll();
        }
        return carsDao.findAll().stream().limit(count).toList();
    }
}
