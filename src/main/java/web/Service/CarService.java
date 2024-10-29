package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.Models.Car;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDAO carDAO;

    public List<Car> getCars(int countCars) {
        return carDAO.getCars(countCars);
    }
}
