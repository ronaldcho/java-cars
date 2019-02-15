package us.ronaldcho.carmodels;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Data
@Entity

public class Car implements Serializable
{
    private @Id @GeneratedValue Long id;
    private int year;
    private String brand;
    private String model;

    public Car()
    {
        // default constructor
    }

    public Car(@JsonProperty("year") int year,
               @JsonProperty("brand") String brand,
               @JsonProperty("model") String model)
    {
        this.year = year;
        this.brand = brand;
        this.model = model;
    }
}
