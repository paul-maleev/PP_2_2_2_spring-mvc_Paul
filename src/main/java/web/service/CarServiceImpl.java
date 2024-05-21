package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class CarServiceImpl implements CarService {

    private List<Car> baseOfCars = allCars();

    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        return Stream.of(count).filter(c -> c > 0 && c < 6).
                map(c -> baseOfCars.stream().limit(c).collect(Collectors.toList())).findFirst().orElse(baseOfCars);

    }

    @Override
    public List<Car> allCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", 7));
        cars.add(new Car(2, "Mercedes", 1));
        cars.add(new Car(3, "Ferrari ", 8));
        cars.add(new Car(4, "Lamborghini  ", 4));
        cars.add(new Car(5, "Ford  ", 5));
        return cars;
    }
}
