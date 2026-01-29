package com.json.carjson;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class CarToJson {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            Car car = new Car("Honda", 800000);

            // Convert Java object to JSON
            String json = mapper.writeValueAsString(car);

            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
