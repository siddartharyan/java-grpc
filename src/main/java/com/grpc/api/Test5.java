package com.grpc.api;

import com.grpc.model.Apartment;
import com.grpc.model.House;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        House house1=House.newBuilder()
                .setName("siddarth")
                .setHno(1)
                .build();
        House house2=House.newBuilder()
                .setName("sai")
                .setHno(2)
                .build();
        List<House>all=new ArrayList<>();
        all.add(house1);
        all.add(house2);
        Apartment apt=Apartment.newBuilder()
                .setName("beng")
                .addAllHouse(all)
                .build();
        System.out.println(apt);
    }
}
