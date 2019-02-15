package us.ronaldcho.carmodels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldcarmodelsApplication
{
    public static final String EXCHANGE_NAME = "CARS";
    public static final String QUEUE_NAME = "QUEUE";

    public static void main(String[] args)
    {
        SpringApplication.run(WorldcarmodelsApplication.class, args);
    }

}

