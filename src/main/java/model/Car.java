package model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    String color;
    int year;
    int weight;

    public Car(String color, int year, int weight) {
        this.color = color;
        this.year = year;
        this.weight = weight;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
