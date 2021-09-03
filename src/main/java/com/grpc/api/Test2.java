package com.grpc.api;

import com.grpc.model.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {
    public static void main(String[] args) throws IOException {
        Person sam=Person.newBuilder()
                .setName("siddarth")
                .setAge(21)
                .build();

        Path path= Paths.get("person.ser");
        Files.write(path,sam.toByteArray());
        System.out.println(
                Person.parseFrom(Files.readAllBytes(path))
        );
    }
}
