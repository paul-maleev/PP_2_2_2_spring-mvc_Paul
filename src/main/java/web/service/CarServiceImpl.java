package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        List<Car> res = new ArrayList<>();
        if (count > 0 && count < 6) {
            for (int i = 0; i < count; i++) {
                res.add(cars.get(i));
            }
        } else {
            return cars;
        }
        return res;
    }

    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 7));
        cars.add(new Car(2, "Mercedes", 1));
        cars.add(new Car(3, "Ferrari ", 8));
        cars.add(new Car(4, "Lamborghini  ", 4));
        cars.add(new Car(5, "Ford  ", 5));
        return cars;
    }
}
