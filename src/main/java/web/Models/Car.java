package web.Models;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private long series;
    private String model;
    private String color;

    public Car() {}

    public Car(long series, String model, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getSeries() {
        return series;
    }

    public void setSeries(long series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
