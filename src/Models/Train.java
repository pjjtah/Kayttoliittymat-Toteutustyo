package models;

import java.util.ArrayList;

public class Train {
    private String engine;
    private int seats;
    private ArrayList<Car> cars;

    public Train(String engine){
        this.engine = engine;
        cars = Car.initCars();

    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}