package web.DAO;

import org.springframework.stereotype.Repository;
import web.Models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1234, "Car1", "Color1"));
        cars.add(new Car(91011, "Car2", "Color2"));
        cars.add(new Car(5678, "Car3", "Color3"));
        cars.add(new Car(121314, "Car4", "Color4"));
        cars.add(new Car(151617, "Car5", "Color5"));
    }


    public List<Car> getCars(int countCars) {
        return cars.stream().limit(countCars).toList();
    }
}
