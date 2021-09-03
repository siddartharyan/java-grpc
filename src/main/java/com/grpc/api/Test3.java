package com.grpc.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.grpc.api.model.JPerson;
import com.grpc.model.Person;

public class Test3 {
    public static void main(String[] args) {
        JPerson json=new JPerson(
          "siddarth",
          21
        );

        Person proto= Person.newBuilder()
                .setName("siddarth")
                .setAge(21)
                .build();
        Runnable runnable1=()->{
            try{
                ObjectMapper mapper=new ObjectMapper();
                byte[] bytes=mapper.writeValueAsBytes(json);
                JPerson person=mapper.readValue(bytes,JPerson.class);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        };

        Runnable runnable2=()->{
            try{
                byte[] bytes=proto.toByteArray();
                Person deserialized=Person.parseFrom(bytes);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        for(int i=0;i<4;i++){
            runPerformanceTest(runnable1,"json");
            runPerformanceTest(runnable2,"protobuf");
        }


    }

    private static void runPerformanceTest(Runnable runnable,String method){
        long time1=System.currentTimeMillis();
        for(int i=0;i<1_000_000;i++){
            runnable.run();
        }
        long time2=System.currentTimeMillis();
        System.out.println(

                "protocol type: "+ method+" "+(time2-time1)
        );
    }
}
