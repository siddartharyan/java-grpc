package com.grpc.api;

import com.grpc.model.Person;

public class Test1 {
    public static void main(String[] args) {
        Person sam= Person.newBuilder()
                .setAge(21)
                .setName("siddarth")
                .build();
        Person sam1=Person.newBuilder()
                .setName("Siddarth")
                .setAge(21)
                .build();
        System.out.println(sam.equals(sam1));
    }
}
