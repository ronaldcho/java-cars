package us.ronaldcho.carmodels;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SeedDatabase
{
    @Bean
    public CommandLineRunner initDB(CarRepository carrepos)
    {
        return args ->
        {

            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "1 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "3 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "5 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "6 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", " Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "1 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "7 Series")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "M3")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "X6")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "M6 ")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "Z4")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "X3")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "X5")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "X5 M")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "BMW", "M6 M")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "CR-V ")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Civic")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Ridgeline")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Accord")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Odyssey")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Pilot")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Insight")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Fit")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Element")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Honda", "Accord Crosstour")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Jetta")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Passat")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Routan")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Eos")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Touareg")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Rabbit")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "GTI")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "CC")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Tiguan")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Volkswagen", "Golf")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "SLK-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "Sprinter")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "G-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "CLS-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "C-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "E-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "GL-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "GLK-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "CL-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "R-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "S-Class")));
            log.info(" Looked up cars " + carrepos.save(new Car(  2010, "Mercedes-Benz", "M-Class")));


//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "BMW", ")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "5 Series", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "6 Series", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "7 Series", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "M3", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "X6", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "M6", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "Z4", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "X3", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "X5", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "M5", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "M5 M", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("BMW", "X6 M", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("Honda", "CR-V", "2010")));
//            log.info(" Looked up cars " + carrepos.save(new Car("Honda", "Civic", "2010")));
        };
    }
}
