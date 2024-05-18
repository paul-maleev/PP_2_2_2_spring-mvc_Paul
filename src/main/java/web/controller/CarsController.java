package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false, defaultValue = "5") Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        List<Car> result = new ArrayList<>();
        cars.add(new Car(1, "BMW", 7));
        cars.add(new Car(2, "Mercedes", 1));
        cars.add(new Car(3, "Ferrari ", 8));
        cars.add(new Car(4, "Lamborghini  ", 4));
        cars.add(new Car(5, "Ford  ", 5));
        if (count > 0 && count < 5) {
            for (int i = 0; i < count; i++) {
                result.add(cars.get(i));
            }
        } else {
            result.addAll(cars);
        }
        model.addAttribute("cars", result);
        return "cars";
    }

}
