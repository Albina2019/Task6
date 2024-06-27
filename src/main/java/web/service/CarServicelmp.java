package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CarServicelmp implements CarService {

    @Override
    public List<Car> getCars(Integer count) {
        List<Car> data = new ArrayList<>();
        data.add(new Car("BMW", 2020, "white"));
        data.add(new Car("Audi", 2021, "red"));
        data.add(new Car("KIA", 2022, "black"));
        data.add(new Car("Honda", 2023, "green"));
        data.add(new Car("Mercedes", 2024, "yellow"));

        List<Car> cars = new ArrayList<>();
        if (Objects.isNull(count)||count>5){
            cars.addAll(data);
        }
        else {
            for (int i = 0; i < count; i++) {
                cars.add(data.get(i));
            }
        }
        return cars;
    }
}
