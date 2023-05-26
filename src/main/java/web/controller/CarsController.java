package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Skoda", 1, "blue"));
        carsList.add(new Car("Audi", 2, "red"));
        carsList.add(new Car("Renault", 3, "green"));
        carsList.add(new Car("Nissan", 4, "black"));
        carsList.add(new Car("Toyota", 5, "white"));

        List<Car> cars = CarsService.getNumbersOfCars(carsList, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
