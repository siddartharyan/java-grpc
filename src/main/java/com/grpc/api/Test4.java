package com.grpc.api;

import com.grpc.model.Car;
import com.grpc.model.Detail;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        Car car=Car.newBuilder()
                .setName("innova")
                .setCompany("toyota")
                .setModel(2021)
                .build();
        Car car1=Car.newBuilder()
                .setName("suzuki")
                .setCompany("maruti")
                .setModel(2020)
                .build();
        List<Car> all=new ArrayList<>();
        all.add(car);
        all.add(car1);
        Detail detail=Detail.newBuilder()
                .setName("siddarth")
                .setAge(21)
                .addAllCar(all)
                .build();
        System.out.println(detail);

    }
}
